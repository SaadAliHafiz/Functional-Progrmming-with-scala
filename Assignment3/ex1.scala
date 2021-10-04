package Asssignment3
object ex1 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7
    val Quad= (a:Int,b:Int,c:Int)=>(x:Int)=>(a*(x*x)) + (b*x) + c
    val lr=  List.fill(10)(util.Random.nextInt(3)-3)
    println(lr)
    println(lr.map(Quad(3,5,7)))
  }
}
