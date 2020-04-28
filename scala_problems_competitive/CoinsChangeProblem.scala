package com.scala.examples

object CoinsChangeProblem { 
  def countChange1(money: Int, coins: List[Int]): Int =
    if (money == 0) 1
    else if (coins.isEmpty || money < 0) 0
    else countChange1(money - coins.head, coins)+countChange1(money, coins.tail)
  def countChange2(money: Int, coins: List[Int]): Int =
    if (money == 0) 1
    else if (coins.isEmpty || money < 0) 0
    else countChange2(money - coins.head, coins)+countChange2(money, coins.tail)
  def main(args:Array[String]):Unit ={
      val Array(n,m)=readLine().split(" ").map(_.toInt)
      val a = readLine().split(" ").toList.map(_.toInt)
      if (n%2==0)  println(countChange1(n/2,a)+countChange2(n/2,a)) 
      else {
        val n1=n/2; val n2=n/2+n%2
        println(countChange1(n1,a)+countChange2(n2,a)) 
      }            
  }
}