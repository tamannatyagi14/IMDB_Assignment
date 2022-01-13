package lectures.part2OPP
abstract class Animal{
  def eat : Unit
}
class Person2(name:String){
  def afunction : String = "Hii"
}
object AnonymousClasses {
  def main(args: Array[String]): Unit = {
    val obj1 = new Animal {
      override def eat: Unit = println("Hello, I am anonymous class")
    }
    /*class AnonymousClasses$$anon$1 extends Animal{
      override def eat: Unit = println("Hello, I am anonymous class ")
    }
    val obj1 = new AnonymousClasses$$anon$1();
    obj1.eat;*/

    println(obj1.getClass)

    var ram = new Person2("Ram"){
      override def afunction: String = "Hii too"
    }

    //anonymous functions are both for class and abstract classes
  }
}
