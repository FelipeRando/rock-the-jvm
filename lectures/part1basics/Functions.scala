package lectures.part1basics

object Functions extends App {
  //def functionName (parameterName: parameterType): ReturnType = {
  def aFunction(a: String, b: Int): String ={
    a + " " + b
  }
  println(aFunction("a",5))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  //decent loop here
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n -1)
  }
  println(aRepeatedFunction("Hello",3))

  //WHEN YOU NEED LOOPS, USE RECURSION :)

  /*
  Exercises
  1. A greeting function (name, age) => "Hi, my name is $name and I'm $age years old"
  2. Factorial function 1*2*3*4*5
  3. Fibonacci function f(1) = 1, f(2) = 1, f(n) = f(n - 1) + f(n - 2)
  4. Test if a number is prime
   */

  //1.
  def greeting(name: String, age: Int ): String = "Hi my name is " + name + " and I'm " + age + " years old"
  println(greeting("Felipe",22))
  //2.
  def factorial(number: Int): Int = {
    if (number <= 0) 1
    else number * factorial(number-1)
  }
  println(factorial(5))
  //3.
  def fibonacci(number: Int): Int = {
    if (number <= 2) 1
    else fibonacci(number - 1) + fibonacci(number - 2)
  }
  println(fibonacci(5))
  //4.
  def isPrime(number: Int): Boolean = {
    number % 2 == 0
  }
  println(isPrime(6))
}
