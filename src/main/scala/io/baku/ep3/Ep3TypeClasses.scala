package io.baku.ep3

import io.baku.model.{Employee, IceCream}

object Ep3TypeClasses extends App {

  implicit val employeeEncoder: CsvEncoder[Employee] = new CsvEncoder[Employee] {
    override def encode(e: Employee): List[String] = List(
      e.name,
      e.number.toString,
      if (e.manager) "yes" else "no"
    )
  }

  implicit val iceCreamEncoder: CsvEncoder[IceCream] =
    new CsvEncoder[IceCream] {
      def encode(i: IceCream): List[String] =
        List(
          i.name,
          i.numCherries.toString,
          if(i.inCone) "yes" else "no"
        )
    }


  def writeCsv[A](values: List[A])(implicit enc: CsvEncoder[A]): String =
    values.map(value => enc.encode(value).mkString(", ")).mkString("\n")

  val employees: List[Employee] = List(
    Employee("Bill", 1, true),
    Employee("Peter", 2, false),
    Employee("Milton", 3, false)
  )

  val employeesCsvRes = writeCsv(employees)
  println(employeesCsvRes)

  val iceCreams: List[IceCream] = List(
    IceCream("Sundae", 1, false),
    IceCream("Cornetto", 0, true),
    IceCream("Banana Split", 0, false)
  )

  val iceCreamsCsvRes = writeCsv(iceCreams)
  println(iceCreamsCsvRes)

  implicit def pairEncoder[A, B](
                                  implicit
                                  aEncoder: CsvEncoder[A],
                                  bEncoder: CsvEncoder[B]
                                ): CsvEncoder[(A, B)] =
    new CsvEncoder[(A, B)] {
      def encode(pair: (A, B)): List[String] = {
        val (a, b) = pair
        aEncoder.encode(a) ++ bEncoder.encode(b)
      }
    }
  val pairedCsvres = writeCsv(employees zip iceCreams)
  println("pairedCsvres: "+pairedCsvres)

  val csvEncIc = CsvEncoder[IceCream]
  println("1: "+csvEncIc.encode(iceCreams.head))

  implicit val booleanEncoder: CsvEncoder[Boolean] =
    CsvEncoder.instance(b => if(b) List("yes") else List("no"))

  println("writeCsv bool: "+writeCsv(List(true, false)))
}
