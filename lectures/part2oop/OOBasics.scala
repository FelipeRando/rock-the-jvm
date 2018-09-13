package lectures.part2oop

import scala.annotation.tailrec

object OOBasics extends App {
  val test = new Test
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Jonas")
  person.greet()

  val person2 = new Person("Baby")




  //exercise 1
  val author = new Writer("J.K","Rowling", 42)
  val novel = new Novel("Harry Potter", 1992,author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println("new release date " + novel.copy(1995).yearOfRelease)

  val counter = new Counter(1)
  counter.inc.inc.inc //increment 3 times
  counter inc(5)
}

class Test

//constructor
class Person(name: String, val age: Int, val favoriteMovie:String = "Titanic"){
  //class parameters are not fields
  //to transform a class into a field you should insert the val key-world before the parameter name
  //every val is a field, it can be used by a class instance
  //at every class instantiation the code block will be evaluated
  val usableVariable = 2
  def likes(movie: String): Boolean = movie == favoriteMovie

  //a function declared inside a class code block is called method
  def greet(name: String): Unit = {
    println(s"${this.name} says, Hi ${name.toUpperCase}")
  }

  //overloading: same name diferent parameters and maybe different return
  def greet(): Unit = println(s"Hi I am $name")

  //constructor overload
  def this(name: String) = this(name,0)//I am creating a contructor that will defaults age to zero if it was not passed in the class instantiation
  //but we can set a default to the parameter age like 'val age: Int = 0'
}

/*
novel and a writer class
Writer: First name, surname, year
  - method fullname
Novel : name, year of release, author
  - authorAge(age of the author at the year release)
  - isWrittenBy (name of the author)
  - copy (new year of release) new instance



 */
class Novel(name: String,val yearOfRelease: Int,val author: Writer){
  def authorAge(): Int ={
    author.age - (2018 - yearOfRelease)
  }
  def isWrittenBy(author: Writer)= author == this.author
  def copy(newYearOfRelease: Int):Novel= {
    new Novel(this.name, newYearOfRelease, this.author)
  }
}

class Writer(firstName: String, surname: String,var age: Int){
  def fullname: String = {
    s"First name: $firstName \nSurname: $surname\nYear: $age"
  }
}


/*
 Counter class
  - receives an int
  - method currentCount
  - method increment/decrement counter by 1, returns a counter
  - overload inc/dec to receive an amount
 */
class Counter(val count: Int){
  def inc = {
    println("Incrementing")
    new Counter(count + 1) // immutability, we never change an instance. When we need to change anything within an instance, we create another instance of a Class
  }
  def dec = new Counter(count - 1)

  //overload the two methods above
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n: Int) = new Counter(count - n)

}

