package com.scala.examples

import annotation.tailrec

object FibonacciSeries extends App {  
  def fib(n: Int): Int = {
    @tailrec
    def fib_tail(n: Int, a: Int, b: Int): Int = n match {
      case 0|1 => a
      case _   => fib_tail(n - 1, b, a + b)
    }
    return fib_tail(n, 0, 1)
  }
  println(fib(3));
  println(fib(4));
  println(fib(5));

}