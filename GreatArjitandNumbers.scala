package com.hackerearth
object GreatArjitandNumbers {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt
    while (t>0) {
      val n = lines.next().toInt
      val line = lines.next().split(" ").map(_.toLong)
      var f = 0L
      for(x <- 1 until n) {
         val k = line(x)/line(x-1)
         f += k*(k+1)/2
      }
      val q = f*(f+1)/2
      println(q%1000000007)
      t-=1
    }        
  }
}