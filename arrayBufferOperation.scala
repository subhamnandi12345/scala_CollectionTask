package Collections_task
import scala.collection.mutable.ArrayBuffer
object Demo {
  def main(args: Array[String]) = {
    var myList = ArrayBuffer("Zara","Nuha","Ayan")
    println(myList);
    // Add an element
    myList += "Welcome";
    // Add two element
    myList += ("To", "Scala");
    println(myList);
    // Remove an element
    myList -= "Welcome";
    // print second element
    println(myList(1));
  }
}
