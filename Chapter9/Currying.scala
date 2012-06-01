// 9.3

def plainOldSum(x: Int, y: Int) = x + y

def curriedSum(x: Int)(y: Int) = x + y

// When you invoke curriedSum, you get two function invocations
// back to back.  The first invocation takes a single parameter, x,
// and returns a function value for the second function.  The second
// function, which takes a parameter, y.

// You can save reference to the "second" function by partially applying the method call

val onePlus = curriedSum(1)_

// you can invoke one plus with a parameter that will add 1 to the int passed in.

onePlus(2) // returns 3