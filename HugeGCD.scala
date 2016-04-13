package com.scala.examples

object HugeGCD {
  def main(args: Array[String]) : Unit = {
    val N=readInt()
    val n1: BigInt=readLine().split(" ").map(BigInt(_)).product
    val M=readInt()
    val n2: BigInt=readLine().split(" ").map(BigInt(_)).product
    println(n1.gcd(n2)%1000000007)    
  }
}