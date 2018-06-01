package fr.pj.digitalAdvertising
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object planSearch extends App {
  val sparkSession = SparkSession
    .builder
    .master(master= "local")
    .appName(name= "planSearchTest")
    .getOrCreate()

    sparkSession.sessionState
    // spark.sql.parquet.binaryAsString = true
    // sparkSession.sql.parquet.binaryAsString = true

  val dataFrame = sparkSession.read.parquet("data/dataTestSoData/3b458f6328eec43e-ece570b100000024_477622404_data.0.parq")
  dataFrame.printSchema()
  dataFrame.select("no_cli").show(10, false).toString

  val left=2
  val right=1
  assert(left!=right)

  val v1=4
  // v1 shouldEqual 4
  val number: Option[Int] = Some(3)
  val noNumber: Option[Int] = None
  val result1 = number.fold(1)(_ * 3)
  val result2 = noNumber.fold(1)(_ * 3)

  println("result1 = " + result1)
  println("result2 = " + result2)

  // val inputTestTextFile = sparkSession.read.textFile("data/docTest.txt")
  // val words = inputTestTextFile.flatMap(line => line.split(" "))
  // val counts = words.map(word => (word, 1)).reduce{case (x, y) => x + y}

  val myMap = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
  val result3 = myMap.size

  println("result3 = " + result3)

  val myMap2 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "MI" → "Michigan")
  val mapValues = myMap2.values
  val result4 = mapValues.size

  println("result4 = " + result4)

  val result5 = mapValues.head
  val result6 = mapValues.last

  println("result5 = " + result5)
  println("result6 = " + result6)

  val myMap3 = myMap2 + ("MI" -> "Meechigan")
  val myMap3Values = myMap2.values
  val result7 = myMap3Values.size
  val result8 = myMap3("MI")

  println("result7 = " + result7)
  println("result8 = " + result8)

  val myMap4 = Map("Ann Arbor" → "MI", 49931 → "MI")
  val result9 = myMap4("Ann Arbor")
  val result10 = myMap4(49931)

  println("result9 = " + result9)
  println("result10 = " + result10)

  val myMap5 = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa")
  val myMap5Suppr = myMap5 - ("MI")
  val result11 = myMap5.getOrElse("MI", "missing data")
  val result11b = myMap5.getOrElse("TX", "missing data")

  val myMap5default = Map("MI" → "Michigan", "OH" → "Ohio", "WI" → "Wisconsin", "IA" → "Iowa") withDefaultValue("missing data")
  val result12 = myMap5default.getOrElse("TX", "missing data")

  println("result11 = " + result11)
  println("result11b = " + result11b)
  println("result12 = " + result12)

  case class Dog(name: String, breed: String)
  val d1 = Dog("Scooby", "Doberman")
  val result13 = d1.toString
  val result14 = d1.name
  val result15 = d1.breed

  println("result13 = " + result13)
  println("result14 = " + result14)
  println("result15 = " + result15)

  val g: String = "Check out the big brains on Brad!"
  val result16 = g indexOf 'o'
  val result17 = g.indexOf('o', 7)

  println("result16 = " + result16)
  println("result17 = " + result17)

  val g1: Int = 31
  val result18 = (g1 toHexString)

  println("result18 = " + result18)


// CASE CLASSES
abstract class Term
  case class Var(name: String) extends Term
  case class Fun(arg: String, body: Term) extends Term
  case class App(f: Term, v: Term) extends Term

  Fun("x", Fun("y", App(Var("x"), Var("y"))))

  val x = Var("x")
  println("Nom de la classe x : " + x.name)

  val x1 = Var("x")
  val x2 = Var("x")
  val y1 = Var("y")
  println("" + x1 + " == " + x2 + " => " + (x1 == x2))
  println("" + x1 + " == " + y1 + " => " + (x1 == y1))

  println("--- Term Pretty Printer ---")
  def printTerm(term: Term) {
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
        printTerm(b)
      case App(f, v) =>
        print("(")
        printTerm(f)
        print(" ")
        printTerm(v)
        print(")")
    }
  }

  val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
  print("Expression de t : ")
  printTerm(t)

  println
  println("--- Term Identity Test ---")

  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }
  val id = Fun("x", Var("x"))
  println("Test de l'identité de id : " + isIdentityFun(id))
  println("Test de l'identité de t : " + isIdentityFun(t))


  // INFIXE TYPES

  case class Person(name: String) {
    def loves(person: Person) = new Loves(this, person)
  }
  class Loves[A, B](val a: A, val b: B)
  def announceCouple(couple: Person Loves Person) =
  //Notice our type: Person loves Person!
    couple.a.name + " is in love with " + couple.b.name
  val romeo = new Person("Romeo")
  val juliet = new Person("Juliet")
  val result19 = announceCouple(romeo loves juliet)

  println("result19 = " + result19)

  // TRANSVERSABLE

  val list = List(4, 6, 7, 8, 9, 13, 14)
  list.foreach(num ⇒ println(num * 4))
  print("list = ")
  println(list)

  val list2: List[Int] = list.foreach(num ⇒ num * 4)
  print("list2 = ")
  println(list2)

  val set = Set(4, 6, 7, 8, 9, 13, 14)
  val result = set.toList
  val test1 = result.isInstanceOf[List[_]]
  println("test1 = " + test1)



}

