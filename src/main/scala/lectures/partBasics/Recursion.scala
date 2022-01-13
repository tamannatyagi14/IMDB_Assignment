package lectures.partBasics

import scala.annotation.tailrec
import scala.jdk.Accumulator

def factorial(n:Int):Int={
  if(n<=1){
    return 1
  }
  else{
    return n*factorial(n-1);
  }
}
//TAIL RECURSION
def anotherfactorial(n:Int):BigInt= {
  @tailrec
  def factHelper(x: Int, accumulator: BigInt): BigInt = {
    if (x <= 1) {
       accumulator
    }
    else {
       factHelper(x - 1,x * accumulator);
    }
  }
  factHelper(n,1);
}

@tailrec
def concateStringTailrec(aString:String,n:Int,accumulator:String):String = {
  if(n<=0){
    accumulator
  }
  else{
    concateStringTailrec(aString, n-1, aString+" "+accumulator)
  }
}
object Recursion {
  def main(args: Array[String]): Unit = {
    println(factorial(10))
    println(anotherfactorial(100))


    //WHEN YOU NEED LOOPS USE TAIL RECURSIONS

    /*
    * 1)concate a string n times
    * 2)isPrime function tail recursion
    * 3)fibonacci function, tail recursions */

    println(concateStringTailrec("hello",4,""))

  }
}
