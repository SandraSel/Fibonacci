object Fibonacci extends App {

  def recFib(n: Int):Int = {
    var start = 0
    var nextNr = 1
    var count = 0

    while (count < n ) if (n <= 1 ) {
      val fibNr = start + nextNr
      start = nextNr
      nextNr = fibNr
      count = count + 1
    }
    nextNr
  }

  val amount = 2
  val fibonacciSeq = recFib(amount)
  println(fibonacciSeq)
}
