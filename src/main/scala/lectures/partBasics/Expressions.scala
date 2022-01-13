package lectures.partBasics
object Expressions extends App {

  val v= 1+2//EXPRESSION
  println(v)
  println(1+3)
  //+,-,*,/,<<,>>,>>>
  println(v==4)
  // ==,!=,<,<=,>,>=
  var v1=2;
  v1+=3;//+=,-=,*=,/=
  println(v1)
  //Instructions={Do} vs Expressions(has value and tyep)
  //IF EXPRESSIONS
  var condition=true
  var value = if(condition) 5 else 3
  println(value)
  println(if(condition) 5 else 3)

  var i=0
  while(i<10){
    println(i)
    i+=1
  }
  //Never right this again
  //every thing in scala is a expression
//  val aWiredValue= (aWiredValue=3) //UNIT==Void
//  println(aWiredValue)
//SIDE EFFECTS -printl(),resigning,whiles
//Code Block -> expresssion,its value is last expression value
val aCodeBlock={
    val y=2
    val z=y+1;
    if(z>2) "Hello" else "Bye"
    5
  }
  println(aCodeBlock)



}
