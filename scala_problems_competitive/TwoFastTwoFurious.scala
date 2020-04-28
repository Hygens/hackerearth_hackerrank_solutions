package com.hackerearth
object TwoFastTwoFurious {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    val dom = lines.next().split(" ").map(_.toInt)
    val brian = lines.next().split(" ").map(_.toInt)
    val max_dom = dom.sliding(2).map{ k => (k(0) - k(1)).abs }.max
    val max_brian = brian.sliding(2).map{ k => (k(0) - k(1)).abs }.max
    if (max_dom>max_brian) { println("Dom") ; println(max_dom) }
    else if (max_brian>max_dom) { println("Brian") ; println(max_brian) }
    else if (max_dom==max_brian) println("Tie")
  }
}