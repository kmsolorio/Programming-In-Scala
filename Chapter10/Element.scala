// An abstract class can be declared with the abstract keyword
// No instances of Element can be created since it is abstract.

abstract class Element {

  // contents is declared by not defined.  Abstract declarations
  // are only allowed in abstract classes.

  def contents: Array[String]

  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length

}

// By extending the ArrayElement with Element, ArrayElement will
// inherit all non-private members (fields and methods) of Element

class ArrayElement(conts: Array[String]) extends Element {

  // ArrayElement is implementing the abstract method contents.

  def contents: Array[String] = conts
}


// The above implementation uses a conts variable passed to the
// ArrayElement at initialization.  The conts name was chosen so
// it would not conflict with the contents method name.  This
// can be avoided in Scala with the Parametric Field

// class ArrayElement rewritten with Parametric Field.

class ArrayElement(
  val contents: Array[String]
) extends Element

// Invoking superclass constors, simply pass in the paramters after
// the superclass name in the extents

class LineElement(s: String) extends ArrayElement(Array(s)) {

  // the override modifier is required when overriding members of
  // the parent class.  The override can be skipped only if it is
  // implementing an abstract member.

  override def width = s.length
  override def height = 1
}