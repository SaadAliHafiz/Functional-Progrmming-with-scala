package Asssignment3
import scala.collection.SortedSet
object ex7 {
def main(args:Array[String]){
  val vec=Vector(1,2,3,4,5)
  println(vec.map(_*2))
  val se=Set(1,2,3,4,5)
//  collection.immutable.SortedSet
val sortedSet = collection.immutable.SortedSet[Int]() ++ se
  println(((sortedSet.map(_*2))))
}


}
