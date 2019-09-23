package ptest

import model.{Employee, IceCream}
import shapeless._
import org.joda.time.DateTime

object ShapelessPG {

  def run() = {
    val emp = Employee("Maciej", 1, true)
    val iceCream = IceCream("Vanillia", 5, false)

    println("!! NOW: "+DateTime.now())

    println(s"emp: $emp iceCream: $iceCream")

    val genEmp = Generic[Employee]
    val genIce = Generic[IceCream]

    def printEmpIce(gen: String :: Int :: Boolean :: HNil) = {
      println("EMP OR ICE: " + gen)
      println("head: "+gen.head)
      println("tail: "+gen.tail)
      println("last: "+gen.last)
      val empCC = genEmp.from(gen)
      val iceCC = genIce.from(gen)

      println("empCC: "+empCC)
      println("iceCC: "+iceCC)
    }

    printEmpIce(genEmp.to(emp))
    printEmpIce(genIce.to(iceCream))

    type EmployeeOrIceCream = Employee :+: IceCream :+: CNil

    val orTest: EmployeeOrIceCream = Coproduct[EmployeeOrIceCream](iceCream)

    println("orTest Employee: "+orTest.select[Employee])
    println("orTest: "+orTest.select[IceCream])

    orTest match {
      case Inl(employee) => println("PM employee: "+employee)
      case Inr(Inl(iceCream)) => println("PM iceCream: "+iceCream)
    }

    type ISB = Int :+: String :+: Boolean :+: CNil
    def cpMatch(v: ISB) = v match {
      case Inl(x) =>
        println("1 "+x)
      case Inr(Inl(x)) =>
        println("2 "+x)
      case Inr(Inr(Inl(x))) =>
        println("3 "+x)
      case Inr(Inr(Inr(_))) => ??? // This impossible case required for exhaustivity
    }

    val foo1 = Coproduct[ISB](23)
    val foo2 = Coproduct[ISB]("foo")
    val foo3 = Coproduct[ISB](true)

    cpMatch(foo1)
    cpMatch(foo2)
    cpMatch(foo3)


    case class IceCreamV1(name: String, numCherries: Int, inCone: Boolean)
    case class IceCreamV2a(name: String, inCone: Boolean)

  }

}
