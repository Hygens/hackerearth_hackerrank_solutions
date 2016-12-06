package com.hackerearth
object RangeQuery {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt    
    val arr = lines.next().split(" ")
    val Q = lines.next().toInt
    for(_ <- 0 until Q) {
      val Array(x,y,v) = lines.next().split(" ")
      println(arr.slice(x.toInt, y.toInt+1).count(k => k.equals(v)))      
    }    
  }
}