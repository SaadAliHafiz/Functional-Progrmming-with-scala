object Task1 {
  def main(args: Array[String]) {
      val r = util.Random
    val lst = List.fill(15)(r.between(50,500)+1).sorted
    println(lst)
    primeNumbs(lst)
    println(primeNumbs(lst))
    def primeNumbs(lst:List[Int]) = lst.filter(x => !((2 until x-1) exists (x % _ == 0)) && x > 1).sorted
val IndPrime = (primeNumbs(lst:List[Int]).map(x2 => lst.indexOf(x2)) zip primeNumbs(lst:List[Int])).toMap
    println(IndPrime)
  }
}