package lectures.part2OPP

object AbstractDataType extends App {
  //abstracts
  abstract class Animal{
    def eat : Unit
    val creatureType:String = "Wild"
  }
  class Dog extends Animal{
    override val creatureType: String = "Canine";

    override def eat: Unit = {
      println("Crunch Crunch")
    }
  }

  //traits
  trait Carnivore{
    def eat(animal:Animal) : Unit
    val creatureType:String = "Fresh Meat"
  }
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded{
    override val creatureType: String = "croc"
    def eat: Unit = {
      println("Num Num")
    }
    def eat(animal: Animal) : Unit = {
      println(s"I am a Crocodile and I am eating ${animal.creatureType}.")
    }
  }

  val c = new Crocodile
  val d = new Dog
  c.eat(d)


  /*Traits vs abstract class
  1) Traits do not have constrcutor parameter
    2) multiple traits can be inherited by same class
  3) traits = behaviour , abstact = thing*/
}
