package lectures.part2OPP
//CONSTRUCTOR
class Person(name:String,val age:Int){
  //  val x=3;
  //  println(1+3)
  def greet(name:String):Unit={
    println(s"${this.name} says:Hello $name")
  }
  //overloading
  def greet():Unit={
    println(s"My name is $name")
  }
  //MULTIPLE CONSTRUCTERS
  def this(name:String) = {
    this(name,0)
  }
  def this()={
    this("Hello")
  }
}
//class parameters are not fields

//Novel , writer
//writer- FN,SN,year of birth,  method(return full name)
//Novel- name,year of release,author(instance of writer) method(return age of author at year of release),
//
class Writer(firstName:String,sirName:String,val year:Int){
  def fullName():String={
    firstName+" "+sirName
  }
}
class Novel(name:String,year:Int,author:Writer){
  def authorAge = {
    year-author.year
  }
  def isWrittenBy(author: Writer)={
    author == this.author
  }
  def copy(newYear:Int): Novel = {
    new Novel(name,newYear,author)
  }
}
class Counter(val count:Int=0){
  def inc = {
    println("Increasing")
    new Counter(count+1)//Immutability
  }
  def dec = {
    println("decreasing")
    new Counter(count-1)//Immutability
  }
  def inc(n:Int):Counter = {
    if(n<=0) this
    else inc.inc(n-1)
  }
  def dec(n:Int):Counter = {
    if(n<=0) this
    else dec.dec(n-1)
  }
  def print = println(count)
}
object OOBasics extends App {
  val person = new Person("John",45);
  println(person.age)
  //println(person.x)
  println("-------------------------")
  person.greet("Ram")
  println("-------------------------")
  person.greet()
  println("-------------------------")
  val p = new Person()
  p.greet()
  println("-------------------------")
  val pp = new Person("Hekko")
  p.greet()
  println("-------------------------")
  val author = new Writer("Ram","Sharma",1812)
  val anotherauthor = new Writer("Ram","Sharma",1812)
  val novel = new Novel("Story of my Life",1823,author)
  println(novel.authorAge)
  println("-------------------------")
  println(novel.isWrittenBy(author))
  println("-------------------------")
  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}