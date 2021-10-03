object Task4{
  def main(args: Array[String]): Unit = {
    val arr = Array.fill(10)(scala.util.Random.nextInt(10))
    println(arr.mkString(","))
    def Even(arr1:Array[Int],arr2:Array[Int],n:Int):Array[Int] = {
      if(n == arr.size) arr2
      else if(arr(n) % 2 == 0) Even(arr,arr2:+arr(n),n+1)
      else Even(arr,arr2,n+1)
    }
    Even(arr,Array(),0)
    println(arr.count(_%2 == 0))
  }
}