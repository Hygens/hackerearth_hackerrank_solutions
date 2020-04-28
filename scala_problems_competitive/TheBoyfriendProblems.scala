package com.hackerearth

object TheBoyfriendProblems {
  def main(args: Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().toInt
    for(_ <- 0 until t) {
      val n = lines.next().toInt
      val ps = lines.next().split(" ").map(_.toInt).sortWith(_.toInt>_.toInt)
      println(ps.mkString(" "))      
    }    
  }  
}