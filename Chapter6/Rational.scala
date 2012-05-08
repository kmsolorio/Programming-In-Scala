class Rational(n: Int, d: Int) {

//
// The n and d are both class parameters.
// The scala compiler will gather these up and create a primary constructor
// that takes the same two parameters.
//
// Any code that is in the body of the class, and is not part of a field or
// method definition will be compiled into the primary constructor.
//

  val numer: Int = n
  val denom: Int = d

// By placing n and d into fields they are now publically accessible.  Without this
// declaration they would be available within methods simpley by calling n or d,
// however for operations such as add, where they must be accessed, you must make them
// public.

  require(d != 0)

  def this(n: Int) = this(n, 1)  // auxillary constructor

// Auxillary constructors start with def this().  Every auxillary constructor must invoke
// another constructor of the same class as its first action.  This can be the primary
// constructor or another auxillary constructor

// The require method takes one boolean parameter.  If the passed value is true,
// require will return normally.  Otherwise, require will prevent the object
// from being constructed by throwing an IllegalArgumentException

  override def toString = n + "/" + d

// the override modifier in front of a method definition signals that a previous
// method definition is overridden.

  def add(other: Rational): Rational = {
    new Rational((numer * other.denom) + (other.numer * denom), denom * other.denom)
  }

  def lessThan(other: Rational) = {
    this.numer * other.denom < other.numer * this.denom
  }

  def max(other: Rational): Rational = {
    if(lessThan(other)) that else this
  } 

// The this keyword refers to the object that is receiving the message.  You can leave off
//  this when accessing fields or methods, however, if you are returning this for further
// evaluation or to allow method chaining, you will need to express that this is the return
// value as in the max method.

}

val exampleOne = new Rational(1, 3)
println(exampleOne)

val exampleTwo = new Rational(2, 5)
println(exampleTwo)

println("The sum of exampleOne and exampleTwo is: " + exampleOne.add(exampleTwo))