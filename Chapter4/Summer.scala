// By importing ChecksumAccumulator.calculate, you can access the calculate method
// simply using calculate(params) instead of invoking it with the fully qualified name

import ChecksumAccumulator.calculate

// The object without a Companion class is considered a Standalone Object.  By defining
// the main method on this object with the Array[String] and result type of Unit, this
// object can be used as the entry point to a scala application.

object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}