package com.scala.examples

import math.{Ordering => Ord}

object SubsetSum2 { 
  var A: Vector[Long]=Vector()
  def f(v: Long) = {
    val s = A.indexWhere(x => x >= v)
    println(s)    
  }
  def main(args: Array[String]) : Unit = {
    val N=readInt()
    A=readLine().split(" ").map(_.toLong).toVector.sorted(Ord.Long.reverse).scanLeft(0L)(_ + _)
    var T:Int=readInt()
    while (T>0) { f(readLong()) ; T-=1 }    
  } 
}