package FP

object MyModule {

  def abs(n:Int): Int =
    if (n<0) -n
    else n

  private def formatAbs(x:Int) = {
    val msg = "The abs val of %d is %d"
    msg.format(x, abs(x))
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n:Int, acc: Int): Int =
      if (n<=0) acc
      else go(n-1, n*acc)

    go(n,1)
  }

  def fibonacci(n: Int): Int = {

    @annotation.tailrec
    def goFib(n: Int, acc: Int ,store: Int): Int = {
      if (n<=0) acc
      else goFib(n-1, acc, (n-1)+store)

    }
    goFib(n, 1, 0)
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(factorial(2))
    println(fibonacci(5))

  }

}
