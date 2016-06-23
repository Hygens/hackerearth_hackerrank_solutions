package com.scala.examples
object Cricket_Rating {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    if (n>0) {
      val ratings = lines.next().replace("  "," ").split(" ").map(_.toInt).toBuffer
      println(ratings.scanLeft(0)((acc, n) => math.max(0, acc + n)).max) 
    } else println(n)
  }
}