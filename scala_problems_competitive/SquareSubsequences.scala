package com.hackerearth
import scala.collection.mutable.ArrayBuffer
object SquareSubsequences {
  val M = 1000000007
  def lcs(a: String, b: String): Long = {
    val sizea = a.length()
    val sizeb = b.length()
    var dp = ArrayBuffer.fill(sizea, sizeb)(0l)
    for (i <- 0 until sizeb) {
      if (a(0) equals b(i)) dp(0)(i) = 1l
      if (i > 0) dp(0)(i) += dp(0)(i - 1)
      dp(0)(i) %= M
    }
    for (i <- 1 until sizea) {
      dp(i)(0) = dp(i - 1)(0)
      for (j <- 1 until sizeb) {
        dp(i)(j) = dp(i - 1)(j) + dp(i)(j - 1)
        if (!(a(i) equals b(j))) dp(i)(j) -= dp(i - 1)(j - 1)
        dp(i)(j) %= M
      }
    }
    return dp.last.last
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().trim().toInt
    for (_ <- 0 until t) {
      val strs = lines.next().trim()
      var res = 0l
      val size_strs = strs.length()
      for (i <- 1 until size_strs) {
        val idx = size_strs - i
        val s1 = strs.substring(i)
        val s2 = strs.substring(0, i)
        res += lcs(s1, s2)
        res %= M
      }
      println(res)
    }
  }
}