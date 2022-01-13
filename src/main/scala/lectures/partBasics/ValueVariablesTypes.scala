package lectures.partBasics

object ValueVariablesTypes {
  def main(args: Array[String]): Unit = {
//    val x: Int = 42;
    val x = 42;
    print(x)
    //VALS ARE IMMUTABLES
    //Compiler can infer type

    val s1: String ="String 1"
    val s2= "String 2"
    val b: Boolean = false
    val c: Char ='a'
    val i:Int = x
    val short:Short = 12345
    val long:Long=2233424342324234234L
    val float:Float=324234.2343F
    val double:Double=3.34

    var a:Int = 12;
    a=45




  }
}
