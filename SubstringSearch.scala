package com.scala.examples

object SubstringSearch {
  def main(args:Array[String]):Unit = {
    val t=readInt()
    for (i <- 0 until t) { 
      val s1 = readLine()
      val s2 = readLine()
      if (s1.indexOf(s2)>=0) println("YES")
      else println("NO")
    }
  }
}