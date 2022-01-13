package lectures.part2OPP

object Inheritance extends App {
  sealed class Animal{
    val creatureType="wild"
     def eat = println("numnum");
  }
    class Cat extends Animal{
       def crunch = {
        eat
        println("cat crunch")
      }

    }
    val c = new Cat;
    c.crunch

    //Constructors
    class Person(name:String,age:Int){
      def this(name:String)=this(name,0)
    }
    class Adult(name:String,age:Int,personId:String) extends Person(name)



  //OverRiding
//    class Dog extends Animal{
//    override val creatureType="Domestic"
//      override def eat = println("Crunch,crunch")
//    }

//  class Dog(override val creatureType:String) extends Animal{
//    override def eat = println("Crunch,crunch")
//  }
//  val dog = new Dog("Domestic")

  class Dog(val ctype:String) extends Animal{
    override val creatureType=ctype
    override def eat = {
      super.eat
      println("Crunch,crunch")
    }
  }
  val dog = new Dog("Domestic")
  dog.eat
  println(dog.creatureType)


  //type substitution(broad:Polymorphism)
  val unknownAnimal : Animal = new Dog("Police")
  unknownAnimal.eat



  //preventing overrides
  // 1) Use final on members
  // 2) use final on class
  // 3) seal the class= extends class in this file , prevent extention in other files
}
