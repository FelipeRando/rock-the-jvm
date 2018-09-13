package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2)) //return character at index n
  println(str.substring(7,11)) //inclusive, exclusive
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Scala", "Java"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println("This number was a String once: " + aNumber)

  //apending uses +:
  println('a' +: aNumberString)

  //you can do prepending using :+ as well
  println(aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))//returns the first n characters

  //Scala-specific: String interpolators

  //s-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I'm $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old" //it can evaluate complex expressions using ${}

  println(greeting)
  println(anotherGreeting)

  //f-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"//if the type of name and speed are not string and float respectively the compile will throw an error

  println(myth)

  //raw-interpolator
  //print string as-is
  println(raw"This is a \n newline")

}
