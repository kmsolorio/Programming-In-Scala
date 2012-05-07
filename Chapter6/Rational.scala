class Rational(n: Int, d: Int) {

//
// The n and d are both class parameters.
// The scala compiler will gather these up and create a primary constructor
// that takes the same two parameters.
//
// Any code that is in the body of the class, and is not part of a field or
// method definition will be compiled into the primary constructor.
//

  require(d != 0)

// The require method takes one boolean parameter.  If the passed value is true,
// require will return normally.  Otherwise, require will prevent the object
// from being constructed by throwing an IllegalArgumentException

  override def toString = n + "/" + d

// the override modifier in front of a method definition signals that a previous
// method definition is overridden.

}

val exampleOne = new Rational(1, 3)
println(exampleOne)