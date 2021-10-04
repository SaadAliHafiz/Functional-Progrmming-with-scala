package Asssignment3

object ex3 {
  def main(args:Array[String]){
    val arr = Vector(3,1,3)
    //  println(arr.grouped(3).map(_.sum).toList)
    //  arr.zip(b).map { case (x, y) => x + y }
    println(arr.map(math.pow(_,2)).sum)
  }
}
