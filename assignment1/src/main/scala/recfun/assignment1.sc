package recfun

object assignment1 {
  
  def balance(chars: List[Char]): Boolean = {

    def loop(chars: List[Char], top: Int): Boolean =
      if (top < 0) false
      else if (chars.isEmpty) {
        if (top > 0) false
        else true
      } else if (chars.head == '(')
        loop(chars.tail, top + 1)
      else if (chars.head == ')')
        loop(chars.tail, top - 1)
      else
        loop(chars.tail, top)

    loop(chars, 0)
  }                                               //> balance: (chars: List[Char])Boolean
  balance("(just an) ()(()()()(())()())example".toList)
                                                  //> res0: Boolean = true
}