package com.hackerearth

object PermutationAgain3 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt    
    while (t>0) {
      val n = BigInt.long2bigInt(lines.next().toLong)
      if (n<=2) println(1)
      else if (n==3) println(n)
      else println((n*n/2 -1))
      t-=1       
    }           
  }
}