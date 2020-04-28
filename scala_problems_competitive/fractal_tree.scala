package com.scala.examples

object FractalTree {
  var s: String = ""

  def dfs(row: Int, col: Int, n: Int, k: Int, es: Array[String]): String = {
    if (n == 0) return ""
    var b = ""
    for (i <- 0 until k) {
      b = es(row - i).substring(0, col) + "1"
      es(row - i) = b + es(row - i).substring(b.size)
      b = es(row - k - i).substring(0, col - i - 1) + "1"
      es(row - k - i) = b + es(row - k - i).substring(b.size)
      b = es(row - k - i).substring(0, col + i + 1) + "1"
      es(row - k - i) = b + es(row - k - i).substring(b.size)
    }
    dfs(row - 2 * k, col - k, n - 1, k / 2, es)
    dfs(row - 2 * k, col + k, n - 1, k / 2, es)
    es.mkString("\n")
  }

  def calc(i: Int): Unit = {
    s += "_"*100+"\n"
  }
  
  for (i <- 0 until 63) calc(i)

  val N = readInt()
  val arr = s.split("\n")
  if (N > 0) s = dfs(62, 49, N, 16, arr)

  def main(args: Array[String]): Unit =
    print(s)

}