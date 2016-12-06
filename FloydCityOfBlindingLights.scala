package com.scala.examples

object FloydCityOfBlindingLights {  
  def floydWarshall(graph: Array[Array[Int]]): Array[Array[Int]] = {
    var distance = graph
    for (i <- 0 until graph.length) distance(i)(i) = 0

    for (k <- 0 until graph.length)
      for (i <- 0 until graph.length)
        for (j <- 0 until graph.length)
          if (distance(i)(k) >= 0 && distance(k)(j) >= 0
            && (distance(i)(j) == -1 || distance(i)(j) > distance(i)(k) + distance(k)(j))) {
            distance(i)(j) = distance(i)(k) + distance(k)(j);
          }
    distance
  }
  
  def main(args: Array[String]) = {
    val lines = io.Source.stdin.getLines();
    val Array(n, m) = lines.next.split(" ").map(_.toInt)
    val graph = Array.fill(n + 1)(Array.fill(n + 1)(-1))
    for (_ <- 0 until m) {
      val Array(x, y, r) = lines.next.split(" ").map(_.toInt)
      graph(x)(y) = r
    }
    val distances = floydWarshall(graph)
    var Q = lines.next.toInt
    while(Q>0) {
      val Array(a,b) = lines.next.split(" ").map(_.toInt)
      println(distances(a)(b))
      Q-=1
    }    
  }
}