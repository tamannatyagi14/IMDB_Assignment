package lectures.partBasics

import apple.laf.JRSUIConstants.Widget

def trFact(n:Int,accumulator:Int=1):Int={
  if(n<=1) {
    1
  }
  else{
    trFact(n-1,n*accumulator)
  }
}
def savePicture(format:String="JPG",width: Int=1234,height:Int=56):Unit={
  println("Save Picture");
}
object DefaultArgs {
  def main(args: Array[String]): Unit = {
    var a= trFact(10)
    println(a)

    savePicture()
    savePicture(width = 4,format = "PNG")
    /*
    * 1)Pass in every Leading Argumrnt
    * 2)Name the Argument
    * */

  }
}
