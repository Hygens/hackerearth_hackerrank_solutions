package com.spoj
import math.sqrt
object PrimesGenerator2 extends App {
  val out = new java.io.PrintWriter(System.out, false)
  def isPrime(n: Long): Boolean = {
    if (n <= 3) return n > 1
    else if (n % 2 == 0 || n % 3 == 0) return false
    else {
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
      }
      return true
    }
  }
  def printIfIsPrime(num: Long) = {
    if (isPrime(num)) {
      out.println(num)
    }
  }
  def getInput(times: Int) = {
    for (input <- 0 until times) yield {
      val range = readLine().split(" ")
      (range(0) toLong, range(1) toLong)
    }
  }
  val ranges = getInput(readInt())
  for (time <- 0 until ranges.length) {
    (ranges(time)._1 to ranges(time)._2).foreach(printIfIsPrime(_))
    if (time != ranges.length - 1)
      out.println()
  }
  out.flush()
}