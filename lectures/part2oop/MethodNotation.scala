package lectures.part2oop

object MethodNotation extends App{

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${this.name} what the heck?!"
    def isAlive : Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")//Infix notations only works with methods that have only one parameter

  val tom = new Person("Tom", "Fight Club")
  println(tom + mary)//operator overloading

  //ALL OPERATORS ARE METHODS
  println(1.+(2))

  //prefix notation = unary operator(syntactic sugar)
  val x = -1 //equivalent to 1.unary_-
  val y = 1.unary_-

  println(y)
  //unary_prefix only works with - + ~ !
  println(!mary)

  //postfix notation only works with functions that do not receive parameters
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary()) //equivalent to the previous call

}




