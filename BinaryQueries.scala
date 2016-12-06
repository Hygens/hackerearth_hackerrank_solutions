package com.hackerearth
object BinaryQueries {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(n,q) = lines.next().split(" ").map(_.toInt)  
    var arr = lines.next().replace(" ","")
    for(_ <- 0 until q) {
      val Q = lines.next().split(" ").map(_.toInt)
      if (Q(0)==0) { 
        val v = BigInt(arr.slice(Q(1)-1, Q(2)),2).toLong
        if (v%2==0) println("EVEN")
        else println("ODD")        
      } else arr = arr.substring(0,Q(1))+(~(arr(Q(1)-1).toInt) & 1).toString()+arr.substring(Q(1)+1)
    }
  }
}