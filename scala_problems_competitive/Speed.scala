package com.hackerearth
object Speed {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt    
    while (t > 0) {
      val n = lines.next().toInt
      val a = lines.next().split(" ").map(_.toLong)
      var min = a(0); var plus = 1
      for (i <- 1 until n) {
        if (a(i) <= min) {
          plus += 1;
          min = a(i)
        } 
      }
      println(plus)
      t -= 1
    }
  }
}