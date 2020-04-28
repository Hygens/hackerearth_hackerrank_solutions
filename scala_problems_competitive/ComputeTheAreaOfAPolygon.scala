package com.scala.examples
import scala.math._
case class PointA(x: Int, y: Int) {
  def distance(other: PointA): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  def collinear(other: PointA): Boolean =
    (x * other.y - y * other.x == 0)
}
object Solution2 {
  def main(args: Array[String]) {
    val N = readInt()
    var seq: Seq[PointA] = Seq[PointA]()
    var point: PointA = PointA(0, 0)
    for (i <- 0 until N) {
      var Array(x, y) = readLine().split(" ").map(_.toInt)
      point = PointA(x, y)
      seq = seq :+ point
    }
    var ordering = seq.sortWith(!_.collinear(_))
    var m = 0
    var n = 0  
    var S=0.0
    if (N > 3) {
      var slid = ordering.sliding(2).toSeq
      for (Seq(le, ri) <- slid)
        if (!le.collinear(ri)) {
          m += le.x * ri.y
          n += le.y * ri.x
        }
      m += slid.last(1).x * slid.head(0).y
      n += slid.last(1).y * slid.head(0).x      
    } else {      
      for (i <- 0 until ordering.length) {  
        if (i<ordering.length-1) {
          m += ordering(i).x * ordering(i+1).y
          n += ordering(i).y * ordering(i+1).x 
        }
      } 
      m+=ordering.last.x*ordering.head.y
      n+=ordering.last.y*ordering.head.x
    }
    if (m>n) S=(m-n).toDouble/2.toDouble
    else S=(n-m).toDouble/2.toDouble
    println(S)
  }
}