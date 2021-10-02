object ex3 {
  def main(args: Array[String])
  {
    // Creating a Map
    val name = Map("Saad" -> "25","Agha" -> "80")
    //Accessing keys of the map
    println(Pattern(name.get("Saad")))
    println(Pattern(name.get("ahmed")))
  }
  // Using Option with Pattern
  // matching
  def Pattern(z: Option[String]) = z match
  {
    case Some(s) => (s)
    // for 'None' class the below string
    // is displayed
    case None => ("key not found")
  }
}
