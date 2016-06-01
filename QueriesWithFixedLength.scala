package com.scala.examples
import scala.collection.mutable.Buffer
object QueriesWithFixedLength { 
  def computeMin(arr: Array[Int],n: Int):Int= {
    var l = Buffer[Int]()
    for (pos <- arr.sliding(n))  
      l.append(pos.max) 
    l.min
  }
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(n,q) = lines.next().split(" ").map(_.toInt)
    var arr = lines.next().split(" ").map(_.toInt)
    val qs = lines.take(q).toList.map(_.toInt)
    for(i <- qs) {
      if (i==1) println(arr.min)
      else {
        println(computeMin(arr,i)) 
      }
    }
  }
}