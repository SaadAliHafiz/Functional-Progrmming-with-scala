object ex1 {

  def lst(): Unit ={
    val z:Array[String] = new Array[String](3)
    z(0) = "Zara" ; z(1)= "Nuha"
    println(z(1))

  }

  def lst1(): Unit ={
    val z = Array("Zara", "Nuha", "Ayan")
    println(z(0))
  }

  def lst2(): Unit ={
    val z = new Array[String](3)
    z(0) = "Zara" ; z(1)= "Nuha"
    println(z(1))

  }
  def main(args:Array[String]): Unit ={
    lst2()
  }

}
