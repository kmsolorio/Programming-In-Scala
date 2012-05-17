(x: Int) => x + 1

// This is an anonymous function.  The => means that
// the item on the left is converted to the item on the
// right


// To make this even more brief, you can use 'target typing'
// target typing allows the targeted usages of the expression
// to influence the type

(x) => x + 1

// in this case, the scala interpreter would assume x to be an
// integer.

// When the type is inferred you may level off parentheses.

x => x + 1


// You can use placeholders, which are noted with an _ so long
// as the parameter is used only one time in the function literal

_ + 1

// If you are using multiple placeholders, the interpreter may not
// be able to infer what the types are.

_ + _

// The above expression does could be intergers or strings and would
// not compile.  To fix this use : Type

(_: Int) + (_: Int)


// Partial Applied Functions
// A partial applied function is an expression which you don't supply
// all of the arguments needed by the function.

def sum(a: Int, b: Int, c: Int) = a + b + c

// by replacing the parameter list or part of the parameter list with _, you
// can create partially applied functions.

val a = sum _

// in the above example, by calling a with 3 arguments, you will complete invote the
// sum function with those arguments.

val b = sum(3, 4, _: Int)

// in example b, you are going to have a function that is waiting for one last
// parameter, by calling b(4), you will complete the function, and it will execute.


