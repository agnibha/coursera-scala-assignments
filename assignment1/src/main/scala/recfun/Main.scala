package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c == 0 || c == r) 1
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

    def loop(chars: List[Char], top: Int): Boolean = 
      if (top < 0) false
      else if (chars.isEmpty) {
        if (top > 0) false
        else true
      }
      else if (chars.head == '(')
        loop(chars.tail, top + 1)
      else if (chars.head == ')')
        loop(chars.tail, top - 1)
      else
        loop(chars.tail, top)

    
    loop(chars, 0)
  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}