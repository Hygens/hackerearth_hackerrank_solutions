package com.hackerearth

object MancunianAndNaughtyNumbers {
  def lengthBase10(x: Int) =
    if (x >= 1000000000) 10
    else if (x >= 100000000) 9
    else if (x >= 10000000) 8
    else if (x >= 1000000) 7
    else if (x >= 100000) 6
    else if (x >= 10000) 5
    else if (x >= 1000) 4
    else if (x >= 100) 3
    else if (x >= 10) 2
    else 1
  def factors(x: Int): Set[Int] = {
    @annotation.tailrec
    def foo(x: Int, a: Int = 2, list: Set[Int] = Set[Int]()): Set[Int] = a * a > x match {
      case false if x % a == 0 => foo(x / a, a, list + a)
      case false               => foo(x, a + 1, list)
      case true                => list + x
    }
    foo(x)
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines
    val Q = lines.next().toInt
    for (x <- 0 until Q) {
      val Array(a, b) = lines.next().split(" ").map(_.toInt)
      var s = 0
      (a to b).view.foreach { i => if (factors(i).size == lengthBase10(i)) s+=1 else s+=0 }
      println(s);
    }
  }
}