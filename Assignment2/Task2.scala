object Task2{
  def main(args: Array[String]): Unit = {
    def charArray(start:Int) : List[Char]={
      def recursion(charList:List[Char],start:Int,end:Int):List[Char] ={
        if(start==end) charList
        else recursion(start.toChar :: charList,start+1,end)
      }
      recursion(List(),start,123).reverse
    }
    println(s"Characters Printer Using Tail Recursion = ${charArray(65)}")
  }
}
