package com.hackerearth
import scala.collection.mutable.Buffer
object PermutationAgain2 {
  def diff_abs(x: Tuple2[Int,Int], y: Tuple2[Int,Int]): Int = {
    (x._1-x._2)+(y._1-x._2)
  }
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
        val zip_sum = maxmin.view.zip(minmax)
        zip_sum.view.sliding(2).foreach { x =>
            psum+=diff_abs(x(0),x(1))
        }
        if (n%2!=0) psum+=(zip_sum.last._1-zip_sum.last._2).abs+(zip_sum.last._2-maxmin.last).abs
        else psum+=(zip_sum.last._1-zip_sum.last._2).abs        
      }
      println(psum)
      t-=1       
    }           
  }
}