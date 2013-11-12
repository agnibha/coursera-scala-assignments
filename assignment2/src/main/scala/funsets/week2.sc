/**
 * Created with IntelliJ IDEA.
 * User: lenovo
 * Date: 11/11/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */

import common._

object rationals {
  class Rational(x: Int, y: Int) {
    def  numer = x
    def denom = y

    def addRational(s:Rational) =
      new Rational(
        numer * s.denom + denom * s.numer, denom * s.denom)

    def neg() = new Rational(-numer, denom)

    def subRational(s: Rational) = addRational(s.neg())

    override def toString() =
      numer + "/" + denom
  }
  val x = new Rational(1,2)
  val y = new Rational(3,4)
  val z = new Rational(1,3)
  x.subRational(y).subRational(z)
  type Set = Int => Boolean
  def singletonSet(elem: Int): Set = (x: Int) => x == elem
  singletonSet(1)

  def set1to100(): Set = {
    (x: Int) => x > 0 && x <= 100

  }
  printSet(set1to100())
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -1000 to 1000 if s(i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }
}
