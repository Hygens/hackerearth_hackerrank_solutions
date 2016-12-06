package com.scala.examples
object QueriesWithFixedLength_1 { 
  def computeMin(arr: Array[Int],n: Int,d: Int):Int= {     
    arr.sliding(d).map( x => x.max ).min    
  }
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(n,q) = lines.next().split(" ").map(_.toInt)
    val arr = lines.next().split(" ").map(_.toInt)
    val qs = lines.take(q).toList.map(_.toInt)
    for(i <- qs) {     
      if (i==1) println(arr.min)
      else {
        println(computeMin(arr,n,i)) 
      }
    }    
  }
}