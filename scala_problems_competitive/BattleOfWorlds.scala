package com.hackerearth
object BattleOfWorlds {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().toInt
    for (u <- 0 until t) {
      val alice = lines.next().trim
      val bob = lines.next().trim
      val intersect = alice.intersect(bob)
      val c1 = alice.size - intersect.size
      val c2 = bob.size - intersect.size
      if (c1 > c2 && c2 == 0) {
        println("You win some.")
      } else if (c2 > c1 && c1 == 0) {
        println("You lose some.")
      } else {
        println("You draw some.")
      }
    }
  }
}