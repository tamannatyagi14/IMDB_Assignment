package lectures.partBasics

object CBNvsCBV extends App {
  def callByValue(x:Long):Unit={
    println("By Value: "+x);
    println("By Value: "+x);
  }
  def callByName(x: => Long):Unit={
    println("By Name: "+x);
    println("By Name: "+x);
  }
  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite():Int = 1+ infinite();
  def printFirst(x:Int,y: => Int)=println(x)

//  printFirst(infinite(),5)
  printFirst(5,infinite())
}
