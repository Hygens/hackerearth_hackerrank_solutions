package com.scala.examples

object VerticalSticks {
  def main(args: Array[String]) = {
    val lines = io.Source.stdin.getLines();
    var T = lines.next().toInt
    while (T>0) {
      val n = lines.next().toInt
      val  tmp = lines.next().split(" ").map(_.toInt).sortWith(_<_);
      var arr = Array.fill(n)(0)
      arr(0) = 1
      for(i <- 1 until n)
        if (tmp(i) > tmp(i-1))
            arr(i) =  i+1
        else arr(i) = arr(i-1)      
      for(i <- 0 until n) {
          arr(i) = n + 1 - arr(i);
      }
      var avg = 0.0f;
      var i = 0
      for(i <- 0 until n) avg += 1.0f/(arr(i) + 1) 
      avg *= n + 1;
      println(f"$avg%.2f")
      T-=1
    }    
  }  
}