package Asssignment3

object ex2 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7
    val Quad= (a:Int,b:Int,c:Int)=>(x:Int)=>(a*(x*x)) + (b*x) + c
    val lr=  List.fill(10)(util.Random.nextInt(3)-3)
    println(lr)
    println(lr.map(Quad(3,5,7)))
    val Ind = ((lr.map(Quad(3,5,7))).map(x2 => lr.map(Quad(3,5,7)).indexOf(x2)) zip (lr))
    print(Ind)
  }
}

