// Standard if Statement

def example1(args: Array[String]): String = {

  var filename = "default.txt"

  if (!args.isEmpty)
    filename = args(0)

  return filename

}

println("Exampe1")
println(example1(args))

// More succinct if
// This is essentially a ternary form

def example2(args: Array[String]): String = {
  val filename = if (!args.isEmpty) args(0) else "default.txt"
  return filename
}

// exmaple2 uses a val instead of var.  Again vals are immutable and
// cannot change once they are set.

println("Exampe2")
println(example2(args))

// While loops, just as in other languages, have a condition and a body.
// The body will execute continuously until the condition is false.

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

// Do - While loops runs the body and then tests the condition.  This means
// the body of the code will always run at least 1 time.

var line = ""
do {
  line = "Hello"
  println("Read: " + line )
} while (line != "Hello")


//  For expressions can be used for many things in Scala.  The simplest way to
//  use a for expression to to iterate over a collection.

val filesHere = (new java.io.File(".")).listFiles
for (file <- filesHere)
  println(file)

//  for can be used with any type of collection, including ranges.
//  1 to 4 would give you 1, 2, 3, 4
//  1 until 4 would give you 1, 2, 3

// Filters can be created by adding an if clause within the parentheses of the for
// for (i <- 1 to 4 if i == 3)

// Scala can return a value from the iteration by prepending the body with the keyword
// yield

def evenNumbers = {
  for (n <- 1 to 100 if n % 2 == 0) yield {
    n
  }
}

println(evenNumbers)


// Scala has conventional try-catch-finally for exceptions


