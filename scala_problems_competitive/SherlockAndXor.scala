package com.hackerearth
object SherlockAndXor {  
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var T = lines.next().toInt
    while (T>0) {
      val n = lines.next().toInt
      val a = lines.next().split(" ").map(_.toLong)
      val odd: Long = a.count { x => x%2!=0 }
      println(odd*((a diff List(0)).size-odd))
      T-=1
    }
  }
}