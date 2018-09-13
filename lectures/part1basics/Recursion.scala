package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int ={
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
  }
  println(factorial(10))//This factorial is SUPER limited because of the JVM stack used for recursion in each stack frame
  /*
  ecsum(5)
  5 + recsum(4)
  5 + (4 + recsum(3))
  5 + (4 + (3 + recsum(2)))
  5 + (4 + (3 + (2 + recsum(1))))
  5 + (4 + (3 + (2 + 1)))
  15
   */

  def tailRecursionFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt ={
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION
    }
    factHelper(n,1)
  }
  println(tailRecursionFactorial(5000))

  /*
  https://stackoverflow.com/questions/33923/what-is-tail-recursion
  tailrecsum(5, 0)
  tailrecsum(4, 5)
  tailrecsum(3, 9)
  tailrecsum(2, 12)
  tailrecsum(1, 14)
  tailrecsum(0, 15)
  15
   */

  //Exercises
  /*
  1. Concatenate a string n times using recursion
  2. Calculate if a number is prime
  3. Fibonacci tail recursive
   */
  //################################
  //1.
  def concatenateTailrec(aString: String, n: BigInt, accumulator: String): String = {
    if(n<=0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)
  }

  println(concatenateTailrec("hello\n",5,""))

  //###############################
  //2.
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if(!isStillPrime) false
      else if(t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailrec( n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(639))


}
