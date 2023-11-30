package Collection_Framework

import scala.collection.immutable._
object MainObject{
  def main(args:Array[String]){
    val games = Set("Cricket","Football","Hocky","Golf")
    println(games.head)             // Returns first element present in the set
    println(games.tail)         // Returns all elements except first element.
    println(games.isEmpty)          // Returns either true or false
  }
}
