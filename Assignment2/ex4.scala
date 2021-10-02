object ex4
{

  // square of an integer
  def square(a:Int):Int
  =
  {
    a*a
  }

  // Main method
  def main(args:Array[String])
  {
    // source collection
    val collection = List(1, 3, 2, 5, 4, 7, 6)

    // transformed collection
    val new_collection = collection.map(square)

    println(new_collection)

  }

}