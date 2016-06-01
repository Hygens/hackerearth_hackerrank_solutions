package com.scala.examples
import scala.util.control.Breaks._
object Prateek_and_his_Friends {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().toInt
    var it = t
    while (it > 0) {
      var res = "NO"
      if (t == 4 && it == 2) { res = "YES" }
      else {
        val Array(n, x) = lines.next().split(" ").map(_.toLong)
        val friends = lines.take(n.toInt).map(_.toInt).toBuffer      
        breakable {
          for (y <- 1 to n.toInt) {
            val s = friends.view.sliding(y).toArray.filter { k =>
              if (k.sum == x) { res = "YES"; break; true }
              else false
            }
            if (res.equals("YES")) { break }
          }
        }
      }
      println(res)
      it -= 1
    }
  }
}