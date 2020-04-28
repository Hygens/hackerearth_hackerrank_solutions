package com.hackerearth
import scala.collection.mutable.Buffer
object PermutationAgain {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt    
    while (t>0) {
      val n = lines.next().toInt
      var psum = 0
      if (n==1 || n==2) psum = 1
      else if (n==3) psum = 3
      else {
        val l: Buffer[Int] = (1 to n).toBuffer
        val minmax = l.take(n/2)
        var maxmin = l.drop(n/2)
        if (n%2!=0) { 
          maxmin = maxmin.sortWith(_>_)
          val last = maxmin.last ; maxmin-=maxmin.last
          maxmin.prepend(last)
        }
        for(i <- 0 until n/2) { 
          psum += (maxmin.head-minmax.head).abs 
          maxmin-=maxmin.head 
          if (maxmin.size>0 && minmax.size>0)
            psum += (minmax.head-maxmin.head).abs
          minmax-=minmax.head 
        }
      }
      println(psum)
      t-=1
    }           
  }
}