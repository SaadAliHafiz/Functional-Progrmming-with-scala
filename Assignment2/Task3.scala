object Task3 {

  def main(args : Array[String]):Unit={
    val arr1 : Array[Double] = Array(1,2,3)
    val arr2 : Array[Double] = Array(3,4,5)
    //val sum=(a:Double,b:Double):Double=>a+b

  println(arrSum(arr1, arr2).mkString(","))
  }

def arrSum(arr1:Array[Double],arr2:Array[Double]):Array[Double]={
    def loop(arr1:Array[Double],arr2:Array[Double],arr3:Array[Double],n:Int): Array[Double] ={
      if (n==arr1.size) arr3
      else {
         loop(arr1,arr2,arr3:+ arr1(n)+arr2(n),n+1)
      }
    }
  loop(arr1, arr2, Array(),0)
}
//    val result = Array.tabulate(ar1.length)(n=>ar1(n)+ar2(n))
//    println(result.mkString(","))



}
