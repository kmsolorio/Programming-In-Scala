class Rational(n: Int, d: Int) {

  require( d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int, 1) = this(n, 1)

  def +(other: Rational): Rational = {
    new Rational((numer * other.denom + other.numer * denom), denom * other.denom)
  }

  def *(other: Rational): Rational = {
    new Rational(numer * other.numer, denom * other.denom)
  }

  override def toString = numer "/" denom

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

}