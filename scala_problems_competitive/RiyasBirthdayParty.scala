package com.hackerearth
object RiyasBirthdayParty {
  def Nth(n:Long):BigInt = {
    val k: BigInt = n-2
    val r: BigInt = (((26+4*(k-2))/2)*(k-1)+15)%1000000007
    r
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt
    while (t>0) { 
      val n = lines.next().toLong
      if (n==1) println(1)
      else if (n==2) println(6)
      else if (n==3) println(15)
      else 
        println(Nth(n)) 
      t-=1 
    }      
  }
}