package com.scala.examples
object DivisibleSumPairs {
   def main(args: Array[String]): Unit = {
    val Array(n,k)=readLine().split(" ").map(_.toInt)
    val A = readLine().split(" ").map(_.toInt)
    var s = 0
    for(t <- 0 until n) 
      for (u <- t+1 until n) 
        if (((A(t)+A(u))%k==0) && (t<u))
            s+=1    
    println(s)
  }
}