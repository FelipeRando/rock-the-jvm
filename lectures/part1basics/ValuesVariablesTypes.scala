package lectures.part1basics

object ValuesVariablesTypes extends App {
  //VALS ARE IMMUTABLE, LIKE CONSTANTS OR FINAL
  //you are not allowed to change the value of a val once it is setted
  //Types of Vals are optional, val x = 2 would work as well
  val x: Int = 42
  val name = "Felipe"
  println(x,name)

  val aBoolean: Boolean = true //this is a boolean
  val aChar: Char = 'c' //this is a char
  val anInt: Int = 5 //this is a integer
  val aShort: Short = 4613 //this is a short, it can store 2 bytes
  val aLong: Long = 312312332 //this is a Long, it can store 8 bytes
  val aFloat: Float = 15.5f //this is a float, note the 'f' at the end of the value
  val aDouble: Double = 155.4 //this is a double
  val aString: String = "Name" //this is a String

  //variables
  var aVariable: Int = 4

  //variables in Scala can be reassigned
  aVariable = 5

  //Functional programming involves working less with variables
  //prefer vals over vars

}
