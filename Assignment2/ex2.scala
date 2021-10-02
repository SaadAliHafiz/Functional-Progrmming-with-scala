object ex2 {
    val mapIm = collection.mutable.Map("Ajay" -> 30,
      "Bhavesh" -> 20,
      "Charlie" -> 50)
    mapIm +=("saad"->25)


    // Accessing score of Ajay
    val saad = mapIm("saad")
    println(saad)

    // Creating a set
    var s1 = Set(5, 1, 3, 2, 4)
        s1 +=8
    // Applying map method

    val result = s1.map(x => x)

    // Display output
    println(result)

}
