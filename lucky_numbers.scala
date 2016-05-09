package com.scala.examples

import scala.collection.immutable.NumericRange
import scala.math.BigDecimal

object LuckyNumbers {
  def sum_of_squares(xs: Seq[Long]) = xs.foldLeft(0L) {(a,x) => a + x*x}
  def main(args: Array[String]): Unit = {
    var T = readInt()
    var s = 0L
    while (T>0) {
      val Array(a, b) = readLine().split(" ").map(_.toLong)
      var y=a
      while (y<=b) {
        val l = y.toString.map(_.asDigit).map(_.toLong) ; val m = l.sum ; val p = sum_of_squares(l)
        if(BigInt.long2bigInt(m).isProbablePrime(1) && 
           BigInt.long2bigInt(p).isProbablePrime(1)) 
          s+=1
        y+=1
      }
      println(s);
      s=0
      T-=1
    }
  }
}