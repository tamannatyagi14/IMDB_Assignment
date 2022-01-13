package lectures.part2OPP
import scala.language.postfixOps
object MethodsNotation extends App {
  class Person(val name:String,favouriteMovie:String,val age:Int=0){
    def likes(movie:String): Boolean ={
      movie == favouriteMovie
    }
//    def hangingout(person: Person):String=s"${this.name} is hanging with $name."
    def +(person: Person):String={
      s"${this.name} is hanging with ${person.name}."
    }
    def +(nickName: String):Person={
      new Person(s"$name($nickName)",favouriteMovie)
    }
    def unary_! : String = {
      s"$name , Hii !!."
    }
    def unary_+ : Person = {
      new Person(name,favouriteMovie,age+1)
    }
    def isAlive: Boolean ={
      false
    }
    def apply() : String = {
      s"Hii . My name is ${name}"
    }
    def apply(n : Int) : String = {
      s"$name watched $favouriteMovie $n times"
    }
    def learns(thing:String) : String = {
      s"$name learns $thing"
    }
    def learnsScala = {
      this learns "scala"
    }
  }

  val mary = new Person("Mary","Hanuman")
  println(mary.likes("Hanuman"))
  println("-------------------------")
  println(mary likes "Hanuman" )// equivalent
  println("-------------------------")
  //infix notation == operator notation (SYntactic sugar)
  //methods with single parameter can be called in this infix notation style

  //Operator in scala
  val tom = new Person("Tom","Sita")
//  println(mary hangingout tom)
  println(mary + tom)
  println("-------------------------")
  println(mary.+(tom))
  println("-------------------------")
  println(1 + 2)
  println("-------------------------")
  println(1.+(2))
  println("-------------------------")
  //ALL THE OPERATERS ARE METHODS IN SCALA

  //prefix notation(other form of (SYntactic sugar)
  val x= -1//equivalent with 1.unary_-
  val y = 1.unary_-
  //unary_ perfix only works with +,-,~,!

  println(!mary)
  println("-------------------------")
  println(mary.unary_!)
  println("-------------------------")


  //postfix notation
  println(mary.isAlive)
  println("-------------------------")
  println(mary isAlive)//this syntactic sugar is called postfix notation(postfix operater notation is only for methods without operaters
  println("-------------------------")

  //compiler gets a object called like a function will check the defination of apply in the class
  println(mary.apply())
  println("-------------------------")
  println(mary())//equivalent
  println("-------------------------")


/*
    1) overload + operator
    mary + "rock start" => new Person "mary(rock start)"
    2) add an age to the person class
      add a unary + operator => new person with the
      +mary => mary with the age incrementer
    3) Add a learn methos in person class => mary learns scala
      add a learnScalaMethod , calls learns method with "scala".
  Use it in postfix notation.
    4) Overload the apply method
      mary.apply(2) => mary watched "Hanuman" 2 times.

*/

  println((mary + "The RockStar")())
  println("-------------------------")
  println((mary + "The RockStar").apply())//same
  println("-------------------------")
  println((+mary).age)
  println("-------------------------")

  println(mary learnsScala )
  println("-------------------------")

  println(mary(10))
}
