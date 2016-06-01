package com.scala.examples
import scala.collection.immutable.NumericRange
object LuckyNumbersBitManipulation {
  def f(n:Long)=n.toBinaryString.count(_=='1')
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var T = lines.next().toInt
    while (T>0) {
      var n = lines.next().toLong
      var s = 0L
      while (n>=3) { 
           if (f(n)==2) s+=n else s+=0   
           n-=1
      }
      println(s)      
      T-=1
    }
  }
}