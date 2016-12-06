package com.scala.examples
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Queue

object BreadthFirstShortestReach {
  val NMAX = 1005;
  def main(args: Array[String]) = {
    val lines = io.Source.stdin.getLines();    
    var t = lines.next.trim().toInt
    while (t > 0) {
      val Array(n, m) = lines.next.trim().split(" ").map(_.toInt)
      var graph = ArrayBuffer.fill(NMAX)(ArrayBuffer[Int]())
      var d = ArrayBuffer.fill(NMAX)(-1)
      for (_ <- 0 until m) {
        var Array(x, y) = lines.next.split(" ").map(_.toInt)
        x-=1; y-=1
        graph(x).append(y); graph(y).append(x)
      }
      val start = lines.next.trim().toInt - 1
      var q = Queue[Int](); q.enqueue(start)
      d(start) = 0
      while (!q.isEmpty) {
        val u = q.dequeue()
        for (i <- 0 until graph(u).length) {
          val v = graph(u)(i)
          if (d(v) == -1) {
            d(v) = d(u) + 1
            q.enqueue(v)
          }
        }
      }
      for (i <- 0 until n) {
        if (i != start)
          if (d(i) == -1)
            print(d(i) + " ")
          else print(d(i) * 6 + " ")
      }
      println("")      
      t -= 1
    }
  }
}