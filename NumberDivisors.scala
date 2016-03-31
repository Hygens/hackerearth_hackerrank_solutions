package com.scala.examples

object NumberDivisors {
  def factors(number: Int, list: List[Int] = List()): List[Int] = {
    for(n <- 1 to number if (number % n == 0)) {
        if (list.indexOf(n)<0) {
          return factors(number / n, list :+ n)  
        }
    }
    list
  }
  def main(args:Array[String]):Unit ={
      val N=readInt()
      for(x <- 0 until N) {
        val n=readInt()
        println(factors(n).length);
      }  
  }
}