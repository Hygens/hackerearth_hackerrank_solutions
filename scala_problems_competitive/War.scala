package com.hackerearth
object War {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().toInt
    for (u <- 0 until t) {
      val n = lines.next().toInt
      var bob = lines.next().split(" ").map(_.toLong).toBuffer.sortWith(_>_)
      var alice = lines.next().split(" ").map(_.toLong).toBuffer.sortWith(_>_)      
      if ((alice diff bob).size==0) println("Tie")
      else {
        for (_ <- 0 until n) {
          if (alice(0) > bob(0)) bob.remove(0)
          else if (bob(0) > alice(0)) alice.remove(0)
        }
        val c1 = bob.size; val c2 = alice.size
        if (c1 > c2) {
          println("Bob")
        } else if (c2 > c1) {
          println("Alice")
        } else println("Tie")
      }
    }
  }
}