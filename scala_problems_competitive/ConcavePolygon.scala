package com.scala.examples
import scala.math._
import util.control.Breaks._
case class PointB(x: Int, y: Int) {  
  def typePolygon(b: PointB, c: PointB): Int = {
    var ret=0
    var angle=0.0
    val m0=(c.y - b.y)/(c.x - b.x)
    val m1=(b.y - y)/(b.x - x)
    if (m0!=m1) 
      angle=atan(abs((m0-m1).toDouble/(1+m0*m1).toDouble)).toDegrees    
    if (angle>=180) 
        ret=2
    else if(angle<180)
        ret=1
    ret
  }
  def collinear(b: PointB, c: PointB): Boolean =
    (((b.x - x)*(c.y - b.y) - (b.y - y)*(c.x - b.x))==0)
  def collinear(b: PointB): Boolean =
    ((x*b.y-y*b.x)==0)
}
object Solution3 {
  def main(args: Array[String]) {
    val N = readInt()
    var seq: Seq[PointB] = Seq[PointB]()
    var point: PointB = PointB(0, 0)
    for (i <- 0 until N) {
      var Array(x, y) = readLine().split(" ").map(_.toInt)
      point = PointB(x, y)
      seq = seq :+ point
    }
    var ord = seq.sortBy(_.x)
    var r=0
    if (N > 3) {
      var slid = ord.sliding(3)
      var u:Seq[Seq[PointB]] = Seq[Seq[PointB]]()
      breakable{for (Seq(le, mi, ri) <- slid) {
        if (!le.collinear(mi,ri)) {
          r=le.typePolygon(mi,ri)
          if (r==2) {
            break
          }
          u=u :+ Seq(le,mi,ri)
        }
        }     
      }
      if (r!=2) {
      if (!u.head(0).collinear(u.last(2))) {
        r=u.head(0).typePolygon(u.last(2), u.last(1))
      }
      }
      if (r==2) println("YES")
      else println("NO")     
    } else {      
      println("NO")
    }    
  }
}