import java.io.File
import java.util.Scanner
var arr = Array.ofDim[String](11,30)
object CSVDemo extends App {
  var row=0
  def functionToRead():Int={
    var r=0;
    val filePath = "src/main/resources/imdb_movies.csv"
    val file=new File(filePath)
    val scanner = new Scanner(file)
    while(scanner.hasNextLine) {
      val line = scanner.nextLine()
      var line2 = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)")
      for(col <- 0 to 21){
        arr(r)(col)=line2(col)
      }
      r=r+1;
    }
    row = r;
    r
  }
  def task1(startYear : Int=1900,endYear: Int=1906,director:String="Charles Tait"): Unit ={

    for(roww <- 0 to 4 ) {
      var year=0
      try{
        year = arr(roww)(3).toInt
      }catch {
        case e:Exception => 0
      }
      if(year>=startYear && year<=endYear && arr(roww)(9).equals(director)) {
        print(arr(roww)(1));
      }
    }
  }
  def task2(reviews:Int):Unit={
    for(roww <- 0 to 4 ) {
      var review=0
      try{
        review = arr(roww)(20).toInt
      }catch {
        case e:Exception => 0
      }
      if(reviews<=review && arr(roww)(8).equals("English")) {
        print(arr(roww)(1));
      }
    }
  }
  def task3(country:String):String={
    var ans=""
    var max=0
    for(roww <- 0 to 4 ) {
      var duration=0
      try{
        duration = arr(roww)(6).toInt
      }catch {
        case e:Exception => 0
      }
      if(arr(roww)(7).equals(country)) {
        if(max<=duration){
          max=duration
          ans=arr(roww)(1)
        }
      }
    }
    ans
  }
  row = functionToRead()
  println("Enter Start year:")
  val sY=scala.io.StdIn.readInt()
  println("Enter End year:")
  val eY=scala.io.StdIn.readInt()
  println("Enter Director Name:")
  val name=scala.io.StdIn.readLine()
  task1(sY,eY,name);
  println("")
  println("----------------------------")
  println("Enter Reviews Number:")
  val rN=scala.io.StdIn.readInt()
  task2(rN);
  println("")
  println("----------------------------")
  println("Enter Name of Country :")
  val country=scala.io.StdIn.readLine()
  println(task3(country));
}
