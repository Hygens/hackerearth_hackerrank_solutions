package com.scala.examples

import collection.mutable.LinkedHashSet
object RastaAndTavas {
  def factors(n: Int): LinkedHashSet[Int] = {
    def divides(d: Int, n: Int) = (n % d) == 0
    def ld(n: Int): Int = ldf(2, n)
    def ldf(k: Int, n: Int): Int = {
      if (divides(k, n)) k
      else if ((k * k) > n) n
      else ldf((k + 1), n)
    }
    n match {
      case 1 => LinkedHashSet()
      case _ => val p = ld(n); factors(n / p)+p
    }
  }
  def main(args: Array[String]): Unit = {
    var tava = 0
    val Array(n, k) = readLine().split(" ").map(_.toInt)
    var l: LinkedHashSet[Int]=LinkedHashSet()
    for (y <- k to n) {
      l = factors(y)
      if (k == l.sum)
        tava += 1
    }
    println(tava)
  }
}