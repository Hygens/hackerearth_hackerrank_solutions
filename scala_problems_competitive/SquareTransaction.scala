package com.hackerearth

object SquareTransaction {
  def binarySearch[A <% Ordered[A]](a: IndexedSeq[A], v: A) = {
    def recurse(low: Int, high: Int): Option[Int] = (low + high) / 2 match {
      case _ if high < low => None
      case mid if a(mid) > v => recurse(low, mid - 1)
      case mid if a(mid) < v => recurse(mid + 1, high)
      case mid => Some(mid)
    }
    recurse(0, a.size - 1)
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    val tr = lines.next().split(" ").map(_.toLong)
    val q = lines.next().toInt
    val dtarget = lines.take(q).toList.map(_.toLong)
    var acc=0
    for (y <- dtarget) {
      val contab = tr.scanLeft(0L)((acc,x)=> acc+x)
      val v = contab.filter(x => x>=y)
      println(v.toList)
      println(contab.toList)
      println(tr.indexWhere { x => x>=v(0) } + 1) 
    }
  }
}