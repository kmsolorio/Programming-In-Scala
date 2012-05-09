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
