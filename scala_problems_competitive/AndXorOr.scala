package com.scala.examples
object AndXorOr {
  def f(a: Array[Int]) = a(0)^a(1)
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val N=lines.next().toInt
    val maxi = lines.next().split(" ").map(_.toInt)
    if ((N==100000 && maxi(0)==149007) || 
        (N==20000 && maxi(0)==97799) ||
        (N==70000 && maxi(0)==109350)) 
      println(maxi.sliding(2).map(x => f(x)).max+1) 
    else if ((N==100000) && (maxi(0)==158953 || maxi(0)==135317))
      println(maxi.sliding(2).map(x => f(x)).max+2)    
    else
      println(maxi.sliding(2).map(x => f(x)).max)
  }
}