package com.hackerearth
import scala.annotation.tailrec
object PandaAndChainReaction {
  implicit def IntToFac(i: Int) = new {
    def ! = (2 to i).foldLeft(1L)( (x,y) => (x*y)%1000003 )
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt
    while (t > 0) {
      val Array(n, k) = lines.next().split(" ").map(_.toInt)
      println((n!) * k % 1000003)
      t -= 1
    }
  }
}