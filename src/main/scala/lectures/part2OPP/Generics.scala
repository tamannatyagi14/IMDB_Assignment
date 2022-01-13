package lectures.part2OPP
//generic class
class MyList[A]{

}
class MyMap[Key,Value]{

}
//generic methods
object MyList{
  def emptyf[A]:MyList[A] = ???
}
object Generics{
  def main(args: Array[String]): Unit = {
    var listOfInt = new MyList[Int]
    var listOfString = new MyList[String]

    var emptyListfIntegers = MyList.emptyf[Int]

    //varience problem

  }
}
