package com.scala.examples
object AbsoluteElementSums {
   def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    var b = lines.next().split(" ").map(_.toLong)
    val q = lines.next().toInt
    val Q = lines.next().split(" ")
    for (s <- Q) {
      val v = s.toInt
      b = b.map(_ + v)
      println(b.map(x => if (x<0) x.abs else x).sum)      
    }
  }
}