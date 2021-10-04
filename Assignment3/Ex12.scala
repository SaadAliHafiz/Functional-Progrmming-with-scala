package Asssignment3

object Ex12 {
  def main(args:Array[String]) {
    val x: Int = 100
    val y: Int = 100
  println(IntToStr(x,y))

    implicit def IntToStr(implicit x: Int,y:Int) = x.toString+y.toString
  }

}
