package com.scala.examples

import scala.collection.mutable.ListBuffer
import math.{ sqrt, pow }

case class Point(x: Double, y: Double) { 
  def round: (Double,Int)=>Double = { (x:Double,s:Int) => BigDecimal(x).setScale(s, BigDecimal.RoundingMode.HALF_UP).toDouble }
  def distance(other: Point): Double =
    round(sqrt(pow(x - other.x, 2) + pow(y - other.y, 2)),2)
}

object Solution {
  
/** Compute the convex hull of given points. Returns vertices ordered ccw */
def convexHull(_points: Seq[Point]): Seq[Point] = {
  val points = _points.sortBy(_.x)
  val upper = halfHull(points)
  val lower = halfHull(points.reverse)
  upper.remove(0)
  lower.remove(0)
  upper ++: lower   
}

def halfHull(points: Seq[Point]) = {
  val upper = new ListBuffer[Point]()
  for (p <- points) {
    while (upper.size >= 2 && leftTurn(p, upper(0), upper(1))) {
      upper.remove(0)
    }
    upper.prepend(p)
  }
  upper
}

def leftTurn(p1: Point, p2: Point, p3: Point) = {
  val slope = (p2.x - p1.x) * (p3.y - p1.y) - (p2.y - p1.y) * (p3.x - p1.x)
  val collinear = math.abs(slope) <= 1e-9
  val leftTurn = slope < 0
  collinear || leftTurn
}

val N = readInt()
var seq: Seq[Point]=Seq[Point]()
var point: Point=Point(0,0)
for(x <- 0 until N) {
   var Array(x,y) = readLine().split(" ").map(_.toInt)
   point=Point(x,y)
   seq=seq:+point
}
seq = convexHull(seq)
val ord = seq.sortBy(_.x)
var soma:Double=0.0
for(Seq(left,right) <- ord.sliding(2)) {
    soma+=left.distance(right)
    soma=point.round(soma,2)
}
soma+=ord.head.distance(ord.last)
soma=point.round(soma,1)

var sum: Double = point.round(seq.zip(seq.tail).map { case (x,y) => x.distance(y) }.sum+
                  seq.head.distance(seq.last),1)

def main(args: Array[String]): Unit =
    println(soma)
    println(sum)  
}