package Playground
import java.time.LocalDate
import java.time.format.DateTimeFormatter

object obs extends App {
  def factorial(n: Int): Int = if (n < 1) {
    1
  } else n * factorial(n - 1)

  println(factorial(7))

  def Fibonacci(n: Int): Int = {
    if (n < 0) {
      0
    }
    else if (n == 0) {
      (0)
    } else if ((n == 1) || n == 2) {
      1
    }
    else (Fibonacci(n - 1) + Fibonacci(n - 2))
  }

  println(Fibonacci(6))

  //  def IsPrime(n:Int): Boolean = {
  //    var i:Int=2
  //    if (n < i) {
  //      return false
  //    }
  //    if (n % i == 0) {
  //      return true
  //    }
  //    if (n == i) {
  //      return true
  //    }
  //    if (i * i > n){
  //      return true
  //    }
  //  }
  //
  // println( IsPrime(7))
  def isPrimeNum(num: Int): Boolean = {

    var start = 2
    if (num == start) {
      return true
    }

    if (num < start) {
      return false
    }

    if (num % start == 0) {
      return false
    }

    if (start * start > num) {
      return true
    }

    return isPrimeNum(num)

  }

  println(isPrimeNum(3))
class Writer(val name:String, val year:Int)
  class Novel(val name: String, val year: Int, val author: Writer) {
    def authorAge = 2021 - this.author.year
    def IsWrittenby(author: String) = author == this.author.name
  }
  val authorObj = new Writer("saad", 1996)
  val novelObj=new Novel("Hell",2012,authorObj)
  println(novelObj.authorAge)
  println(novelObj.IsWrittenby("saad" ))
}

