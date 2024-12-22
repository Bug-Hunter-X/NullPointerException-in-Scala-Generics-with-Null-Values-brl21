```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main extends App {
  val myInt = new MyClass(10) 
  myInt.printValue() //This works fine

  val myString = new MyClass("hello")
  myString.printValue() //This also works fine

  val myList = new MyClass(List(1,2,3))
  myList.printValue() //This also works fine

  val myNull = new MyClass(null)
  myNull.printValue() //this will throw NullPointerException at runtime
}
```