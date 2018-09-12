package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 // EXPRESSION
  println("Resultado",x * 2)
  printf("Resultado %d\n", x * 4)
 val y = 1 == 3
  println(y)
  println(!(1 == 3))

  var aVariable = 3
  aVariable += 2
  println(aVariable)

  //Instructions (DO) vs Expressions (VALUE)
  //Instructions tells a computer what to do (imperative language like Java)
  //Expressions have a value

  //IF expressions
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 //this expression gives a Value

  //In SCALA and any functional programming language we work with EXPRESSIONS, not INSTRUCTIONS
  //another example
  println(if(aCondition) 5 else 3)//if is an expression and evaluates to something

  //looooops
  //this is what we do in Imperative Language
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  //NEVER WRITE THIS AGAIN.
  //The worst thins a skilled programmer can do is write imperative code with Scala syntax

  //EVERYTHING in Scala but val/var/package declarations is a Expression!

  val aWeirdValue = (aVariable = 3) //Unit === void
  println(aWeirdValue)

  //Unit are the only possible return for side-effects. Side effects are the reminiscent of imperative promgramming
  //like Java...Instructions

  //Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }//is a Expression. The value of a block is the value of it's last line

  //1. Whats the difference between "hello world" and println("hello world")?
  // R: the string is a string value, a string literal, the println is an expression, a side effect
  //2. whats the value of this code block

  val someValue = {
    2 < 3
  }//this is a boolean
  println(someValue)

  //3.

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someOtherValue)
}
