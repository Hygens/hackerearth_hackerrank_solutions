package com.scala.examples
import scala.math.BigInt
object blackbox_1 {  
  def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n) 
  def isCoprimeTo(m:Int, n: Int): Boolean = gcd(m, n) == 1 
  def main(args: Array[String]): Unit = {
      var T=readInt()
      while (T>0) {
          var Array(a,b,c)= readLine().split(" ").map(_.toInt).sortWith(_<_)
          val coprimes = (BigInt(a).pow(2)+BigInt(b).pow(2)==BigInt(c).pow(2)) && isCoprimeTo(a,b) && isCoprimeTo(b,c)
          if (coprimes) println("YES")
          else println("NO")
          T-=1
      }        
  }
}