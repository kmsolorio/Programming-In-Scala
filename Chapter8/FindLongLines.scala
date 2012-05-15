import scala.io.Source

object FindLongLines {

  def main(args: Array[String]) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }

}
object LongLines {

  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for(line <- source.getLines())
      processLine(filename, width, line)
  }

  // Using private you can hide access to this method from other clients
  private def processLine(filename: String, width: Int, line: String) {
    if (line.length > width)
      println(filename +": " + line.trim)
  }

  // Alternatively you can define functions within other fuctions, and
  // just like local variables, the functions are only avaialble within
  // the executing block.

  // One advantage of the nested function, is that they have access to the
  // containing methods parameters.  In the above example, you would only
  // need to define processLine to take the line parameter, as it would
  // have access to both filename and width.

}