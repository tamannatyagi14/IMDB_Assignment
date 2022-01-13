package lectures.part2OPP

object Objects{
  //Scala does not have class level functionality("static")
  object Person{  //this will pervide class level type of functionality + it will not take argument list like class
    val N_Eye=2;
    //static/class level functionality
    def canFly : Boolean = false

    //factory method
//    def from(mother:Person,father:Person):Person = new Person("Bobie")
    def apply(mother:Person,father:Person):Person = new Person("Bobie")
  }  // This object person  is its type + only instance



  class Person(name:String){
    //instance level functionality
  }//COmpanions


  def main(args: Array[String]):Unit=
  {
    println(Person.N_Eye)
    println(Person.canFly)

    //Scala Object == SINGLETON Instance
    //  val mary = Person
    //  val john = Person
    //  println(mary==john)

    val mary = new Person("Mary")
    val john = new Person("John")
    println(mary==john)

    val person1 = Person
    val person2 = Person
    println(person1==person2)


    val bobie = Person(mary,john)
    //scala applicartion=scala object with
    //def main(args: Array[Sytring]):Unit
  }

}
