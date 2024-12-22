```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    value match {
      case null => println("Value is null")
      case _ => println(value)
    }
  }
}

object Main extends App {
  val myInt = new MyClass(10)
  myInt.printValue()

  val myString = new MyClass("hello")
  myString.printValue()

  val myList = new MyClass(List(1, 2, 3))
  myList.printValue()

  val myNull = new MyClass(null)
  myNull.printValue() //This will now print "Value is null"
}
```