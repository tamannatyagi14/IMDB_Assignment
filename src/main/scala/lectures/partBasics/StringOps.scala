package lectures.partBasics

object StringOps extends App {
  val str: String = "Hello,I am learning Scala"
  println(str.charAt(2))
  println(str.substring(0,3));
  println(str.split(",").toList);
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)
  val aNumberString = "45"
  val anumber = aNumberString.toInt
  println('a'+anumber+'z')
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)

  //S-interpolators
  val name="David"
  val age = 23
  val greeting = s"Hello my name is $name and my age is $age"
  val anotherGreeting = s"Hello my name is $name and my age is ${age+2}"
  println(greeting)
  println(anotherGreeting)

  //F-interpolators
  val speed = 2.3
  val myth = f"Hello my name is $name and my age is ${age+2} and I can walk with $speed%.3f"
  println(myth)

  //raw-interpolators
  println(raw"This is a \n Newline")
  val e = "This is a \nNewline";
  println(raw"$e")



}
