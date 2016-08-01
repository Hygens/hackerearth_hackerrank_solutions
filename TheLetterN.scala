package com.scala.examples
import scala.math._
case class PointX(x: Int, y: Int) {
  def isNinetyAngle(b: PointX, c: PointX): Double = {
    val d_xb = distanceX(b)
    val d_xc = distanceX(c)
    val d_bc = b.distanceX(c)
    acos((pow(d_xb, 2) + pow(d_xc, 2) - pow(d_bc, 2)) / (2 * d_xb * d_xc)).toDegrees
  }
  def distanceX(other: PointX): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))
  def collinearX(b: PointX): Int = (x*b.y-y*b.x)
}
object TheLetterN {
  def validLetter(a: PointX, b: PointX, c: PointX, d: PointX): Boolean = {
    val aBc = b.isNinetyAngle(a, c)
    val dCb = c.isNinetyAngle(b, d)
    ((a.collinearX(b)>=0) && (d.collinearX(a)<0) && (aBc <= 90.0) && (dCb <= 90.0))
    //((a.x>c.x || c.collinearX(a)>0 || a.collinearX(c)>0) && (d.x<b.x || b.collinearX(d)<0 || d.collinearX(b)<0) && (aBc <= 90.0) && (dCb <= 90.0)) 
    //((!a.collinearX(d)) && (a.x>=b.x && b.x>=c.x) && (d.x<=c.x && c.x<=b.x) && (aBc>0 && aBc <= 90.0) && (dCb>0 && dCb <= 90.0))     
  }
  def main(args: Array[String]) {
    val lines = io.Source.stdin.getLines()
    val N = lines.next().trim().toInt
    var seq: Seq[PointX] = Seq[PointX]()
    var point: PointX = PointX(0, 0)
    for (i <- 0 until N) {
      var Array(x, y) = lines.next().trim().split(" ").map(_.toInt)
      point = PointX(x, y)
      seq = seq :+ point
    }
    var s = 0
    val ord = seq.sortWith(_.x<_.x)
    var slid = ord.sliding(4).toList
    for (points <- slid) {
      s += points.permutations.filter{ x => validLetter(x(0),x(1),x(2),x(3)) }.length
    }    
    println(s/2)
  }
}