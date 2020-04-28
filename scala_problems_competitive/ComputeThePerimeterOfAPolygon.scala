package com.scala.examples
import scala.math._
case class PointLR(x: Int, y: Int) {
  def distance(other: PointLR): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  def collinear(other:PointLR): Boolean = 
    (x*other.y - y*other.x==0)
}
object Solution { 
  def main(args: Array[String]) {
    val N = readInt()
    var seq: Seq[PointLR] = Seq[PointLR]()
    var point: PointLR = PointLR(0, 0)
    for (i <- 0 until N) {
      var Array(x, y) = readLine().split(" ").map(_.toInt)
      point = PointLR(x, y)
      seq = seq :+ point
    }
    var ordering = seq.sortWith(!_.collinear(_))
    var so:Double=0
    if (!ordering.head.collinear(ordering.last))
      so+=ordering.head.distance(ordering.last)
    for(Seq(le,ri) <- ordering.sliding(2)) 
      if (!le.collinear(ri))
        so+=le.distance(ri)
    println(so)
  }
}