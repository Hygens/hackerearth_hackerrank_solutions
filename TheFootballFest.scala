package com.hackerearth

object TheFootballFest {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().toInt
    for (_ <- 0 until t) {
      val Array(n, p) = lines.next().split(" ").map(_.toInt)
      var stack = Vector[Int]()
      stack = stack :+ p
      for (_ <- 0 until n) {
        val vals = lines.next().trim().split(" ")
        if (vals(0).equals("P")) stack = stack :+ vals(1).toInt
        else stack = stack :+ stack(stack.size - 2)
      }
      println("Player " + stack.last.toString)
    }    
  }
}
