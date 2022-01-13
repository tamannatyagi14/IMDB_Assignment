package lectures.part2OPP

case class PersonCase(name: String,age:Int)
object CaseCLass {
  def main(args: Array[String]): Unit =
  {
    var ram = new PersonCase("Ram",12)
    //1) class parameters are fields
    println(ram.name)

    //2)sensible to Tostring
    //println(ram)==println(ram.toString)
    println(ram)
    println(ram.toString)

    //3) equals and hascode OOTB
    var ram2 = new PersonCase("Ram",12)
    println(ram==ram2)

    //4)cc has copy handy method
    var ram3 = ram.copy()
    println(ram==ram3)

    var ram4 = ram.copy(age=56)
    println(ram==ram4)

    //5) cc has companion objects // no need of new keyword
    var sita = PersonCase
    println(sita)

    var sita2 = PersonCase("Sita",34)
    println(sita2)

    //6) CC are serializable

    //7) cc can be used for pattern matching

    // case objects are just like case classes except that they have companion objects as they are their own companion objects
    case object India{
      /*def name : String = {
        "the country"
      }*/   //doubt
      def name : String = "Country"
    }


    //exercise - expend list with case class and case objects
  }
}
