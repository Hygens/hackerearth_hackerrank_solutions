package com.scala.examples

object BennyAndTheUniverse { 
  def comb(money: Long, coins: Array[Long]): Long = {
    var s=0L
    @annotation.tailrec
    def fhead(money: Long, coins: Array[Long]): Long =
      if (money == 0) 1L
      else if (coins.isEmpty || money < 0) 0L
      else 
        return fhead(money - coins.head, coins)
    @annotation.tailrec
    def ftail(money: Long, coins: Array[Long]): Long =
      if (money == 0) 1L
      else if (coins.isEmpty || money < 0) 0L
      else 
        return ftail(money, coins.tail)
    s = fhead(money - coins.head,coins)+ftail(money,coins.tail)  
    return s
  }
  def main(args:Array[String]):Unit ={
      val lines = io.Source.stdin.getLines()
      val Array(n,q)=lines.next().split(" ").map(_.toInt)
      val a = lines.next().split(" ").map(_.toLong)
      var t = q
      var tot = 0L
      while (t>0) {
        val Q = lines.next().toLong
        if (comb(Q,a)>0) println("YES")
        else println("NO")
        t-=1
      }
  }
}