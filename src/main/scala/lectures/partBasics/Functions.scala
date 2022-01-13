package lectures.partBasics

object Functions extends App {


  def aFunction(a:String,b:Int):String={
    a+" "+b
  }
  val a = aFunction("Hello",1)
  println(a)
  println(aFunction("Hello",1))


  def aParameterLessFunction():Int=23;
  println(aParameterLessFunction())


  def anotherFunction()=23;
  println(anotherFunction())


  def recursiveFunction(s:String,i:Int):String={
    if(i<1)
      {
        s
      }
    else {
      s+" "+recursiveFunction(s,i-1)
    }
  }
  println(recursiveFunction("Hello",4))



  def anothFunctionReturnTypeUnit_SideEFFECTS(s:String):Unit={
    println("s")
  }//side effects->not mathematial computing
  anothFunctionReturnTypeUnit_SideEFFECTS("gfjf")

  //WHEN YOU NEED LOOP , USE RECURSION

  /////////////////////////

  println("-------------------------------")
  def aBigFunctions(n:Int):Int={
    def aSmallFunction(a:Int,b:Int):Int={
      a+b
    }
    aSmallFunction(n,n-1)
  }
  println("Local function output :"+aBigFunctions(5))

  println("-------------------------------")

  /*
 * 1) greeting function of name and age.
 * 2) Factorial Function - 1*2*3*4*...*n
 * 3) Fibonacci function
 * 4) Number is Prime or Not
 * */

  def greeating(n:String,a:Int):String={
    "My name is "+n+" and my age is "+ a;
  }
  println(greeating("Golu",20))

  println("-------------------------------")

  def calculateFactorial(n:Int):Int={
    if(n==1){
      n
    }
    else{
      n*calculateFactorial(n-1)
    }
  }
  println("Factorial is " + calculateFactorial(3))

  println("-------------------------------")


  def calFibonacci(n:Int):Int={
    if(n<=1) {
      1
    }
    else {
      calFibonacci(n-1)+calFibonacci(n-2)
    }
  }
  println("Fabonacci is " + calFibonacci(4))

  println("-------------------------------")

  def isPrime(num:Int):Boolean = {
    def isPrimeUtil(temp : Int):Boolean={
      if(temp<=1){
        true
      }
      else {
        num%temp != 0 && isPrimeUtil(temp-1)
      }
    }
    isPrimeUtil(num/2)
  }
  println("Number is Prime or Not: "+isPrime(4))
}