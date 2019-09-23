package io.baku.ep3.sec321

import io.baku.ep3.CsvEncoder
import io.baku.model.IceCream
import shapeless._

object Sec321 extends App {

  def createEncoder[A](func: A => List[String]): CsvEncoder[A] =
    new CsvEncoder[A] {
      def encode(value: A): List[String] = func(value)
    }

  implicit val stringEncoder: CsvEncoder[String] = createEncoder(str => List(str))
  implicit val intEncoder: CsvEncoder[Int] = createEncoder(num => List(num.toString))
  implicit val booleanEncoder: CsvEncoder[Boolean] = createEncoder(bool => List(if(bool) "yes" else "no"))
  implicit val hnilEncoder: CsvEncoder[HNil] = createEncoder(hnil => Nil)
  implicit val doubleEncoder: CsvEncoder[Double] = createEncoder(d => List(d.toString))

  implicit def hlistEncoder[H, T <: HList](
                                            implicit
                                            hEncoder: CsvEncoder[H],
                                            tEncoder: CsvEncoder[T]
                                          ): CsvEncoder[H :: T] =
    createEncoder {
      case h :: t =>
        hEncoder.encode(h) ++ tEncoder.encode(t)
    }


  val reprEncoder: CsvEncoder[String :: Int :: Boolean :: HNil] =
    implicitly

  implicit val iceCreamEncoder: CsvEncoder[IceCream] = {
    val gen = Generic[IceCream]
    val enc = CsvEncoder[gen.Repr]
    createEncoder(iceCream => enc.encode(gen.to(iceCream)))
  }

  implicit def genericEncoder[A, R](
                                     implicit
                                     gen: Generic.Aux[A, R],
                                     enc: CsvEncoder[R]
                                   ): CsvEncoder[A] =
    createEncoder(a => enc.encode(gen.to(a)))

  def writeCsv[A](values: List[A])(implicit enc: CsvEncoder[A]): String =
    values.map(value => enc.encode(value).mkString(", ")).mkString("\n")

  val iceCreams: List[IceCream] = List(
    IceCream("Sundae", 1, false),
    IceCream("Cornetto", 0, true),
    IceCream("Banana Split", 0, false)
  )
  println("writeCsv(iceCreams): "+writeCsv(iceCreams))

  //3.3
  sealed trait Shape
  final case class Rectangle(width: Double, height: Double) extends Shape
  final case class Circle(radius: Double) extends Shape

  implicit val cnilEncoder: CsvEncoder[CNil] =
    createEncoder(cnil => throw new Exception("Inconceivable!"))

  implicit def coproductEncoder[H, T <: Coproduct](
                                                    implicit
                                                    hEncoder: CsvEncoder[H],
                                                    tEncoder: CsvEncoder[T]
                                                  ): CsvEncoder[H :+: T] = createEncoder {
    case Inl(h) => hEncoder.encode(h)
    case Inr(t) => tEncoder.encode(t)
  }

  val shapes: List[Shape] = List(
    Rectangle(3.0, 4.0),
    Circle(1.0)
  )

  println("shapes: "+writeCsv(shapes))


}
