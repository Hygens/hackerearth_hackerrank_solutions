package com.scala.examples
import scala.math._
import scala.util.control.Breaks._

object FunctionOrNot {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)
  def modN(n: Int,m:Int) = 
    (if (n>m) (n % n) == 0 else (m % n) == 0)    
  def main(args:Array[String]) {
    var T=readLine() trim() toInt
    var r=true
    while (T>0) {
      var N:Int=readInt()
      for(n <- 0 until N) {
        var Array(x,y)=readLine().split(" ") map(_.trim().toInt)
        r&=modN(x,y)        
      } 
      if (r==true) println("YES")
      else println("NO")
      T-=1
     }
  }
}