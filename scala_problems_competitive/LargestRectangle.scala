package com.scala.examples
import scala.collection.mutable.Stack
object LargestRectangle { 
  def maxArea(hist: Stack[Int], n: Int):Int = {
    var s = Stack[Int]()
    var max_area = 0
    var tp = 0
    var area_with_top = 0
    var i = 0
    while (i < n) {
        if (s.isEmpty || hist(s.top) <= hist(i)) {
            s.push(i); i+=1
        } else
        {
            tp = s.top ;  s.pop()
            if (s.isEmpty)
                area_with_top = hist(tp)*i 
            else 
                area_with_top = hist(tp)*(i-s.top-1)           
            if (max_area < area_with_top)
                max_area = area_with_top
        }        
    }
    while (!s.isEmpty) {
        tp = s.top ; s.pop();
        if (s.isEmpty)
           area_with_top = hist(tp)*i 
        else 
           area_with_top = hist(tp)*(i-s.top-1)           
           if (max_area < area_with_top)
               max_area = area_with_top
    }
    return max_area;
  }  
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines() 
    var n = lines.next().toInt
    var list = lines.next().split(" ").map(_.toInt).to[Stack]
    println(maxArea(list,n))    
  }
}