package lectures.part4pm

import scala.util.Random

object PatternMatching extends App {
  //switch on steroids
  val random = new Random
  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the one"
    case 2 => "the two"
    case 3 => "the three"
    case 4 => "the four"
    case _ => "something else"
  }

  println(x)
  println(description)

  //1)Decompose value
  case class Person(name:String,age:Int)
  val bob = Person("Bob",12)
  val greeting = bob match {
    case Person(n, a) if a<21 => s"hii,my name is $n and my age is $a"
    case Person(n,a) => s"hii"
    case _ => "Hello"
  }
  println(greeting)

  // cases are matched in order
  // what if no case match ?? MatchError
  // type of patternmatch experession ?? -> unified type in all the type in all the cases


  //PM on sealed Hierarchies



}
