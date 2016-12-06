package com.scala.examples
import scala.collection.mutable.Buffer
object QueriesWithFixedLength {  
  def computeMin(arr: Array[Int],n: Int,d: Int):Int= {
    var tmp = arr.slice(0,d).toBuffer[Int] 
    var res = Buffer[Int]()
    res.append(tmp.max)    
    for (i <- d until n) {
      tmp.remove(0) ; tmp.append(arr(i))    
      res.append(tmp.max)
    }
    res.min
  }
  
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(n,q) = lines.next().split(" ").map(_.toInt)
    val arr = lines.next().split(" ").map(_.toInt)
    val qs = lines.take(q).toList.map(_.toInt)     
    for(i <- qs) {      
      if (i==1) println(arr.max)
      else {
        println(computeMin(arr,n,i)) 
      }
    }
  }
}