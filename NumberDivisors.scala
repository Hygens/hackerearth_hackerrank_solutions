package com.scala.examples

object NumberDivisors {
  def factors(x: Long): List[Long] = {
    @annotation.tailrec
    def f(x: Long, a: Long = 2, list: List[Long] = Nil): List[Long] = a * a > x match {
      case false if x % a == 0 => f(x / a, a, a :: list)
      case false               => f(x, a + 1, list)
      case true                => x :: list
    }
    f(x)
  }
  def main(args: Array[String]): Unit = {
    val N = readInt()
    var sum: Int=1
    var l: List[Long]=List[Long]()
    for (x <- 0 until N) {
      val n = readLong()
      l=factors(n)
      if (!l.isEmpty && !(l.size==1 && l(0)==1)) {
        for((k,v) <- l.groupBy(identity).mapValues(_.size))
          sum*=(v+1)
      }
      println(sum); 
      sum=1
    }
  }
}