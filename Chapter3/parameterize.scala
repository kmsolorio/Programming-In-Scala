// You Parameterize an object with values and types

// Here we create a val set as greetStrings that instantiates a 
// new instance of Array with type String, and value 3

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for ( i <- 0 to 2 )
  print(greetStrings(i))

// List concatination

val OneTwo = List(1, 2)
val ThreeFour = List(3, 4)

// concatination operator :::
println(OneTwo ::: ThreeFour)

// Prepending elements to a list use ::

val starWarsCharacters = List("Han", "Luke")
println("Yoda" :: starWarsCharacters)

// Lists are immutable.  All the operations above return new List objects,
// the original List objects have not been changed.

// Nil returns and empty List


// Tuples are like Lists in that they are immutable, but they can contain
// various objects.

val myNewTuple = ("hey", 123, "I'm a tuple")

// To access the members of a tuble, use the ._n notation.  Tuples, unlike Lists
// are one based, so myNewTuple._1 would be like myNewList(0)

println(myNewTuple._1)

// Sets and Maps default to immutable, if you want the mutable version, it requires the
// user of an import

import scala.collection.mutable.Map