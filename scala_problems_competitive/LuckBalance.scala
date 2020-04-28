package com.scala.examples
import scala.collection.mutable.Buffer
object LuckBalance {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var Array(n, k) = lines.next().split(" ").map(_.toInt)
    var L = Buffer[Int]()
    var M = Buffer[Int]()
    while (n > 0) {
      val Array(l, p) = lines.next().split(" ").map(_.toInt)
      if (p == 1) L.append(l);
      else M.append(l);
      n -= 1
    }
    L = L.sortWith(_ < _)
    println(L.drop(L.size - k).sum + M.sum - L.take(L.size - k).sum)
  }
}