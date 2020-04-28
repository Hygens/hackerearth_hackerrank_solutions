package com.scala.examples

import scala.collection.mutable.Seq

object DynamicArray { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()  
    val Array(n,q) = lines.next().split(" ").map(_.toInt) 
    var seq: Seq[Seq[Int]]= Seq.fill(n){Seq[Int]()}
    var lastAns=0
    for (i <- 0 until q) {
      val Array(qu,x,y)=lines.next().split(" ").map(_.toInt)
      var idx = (x^lastAns)%n
      if (qu==1)  seq.update(idx,seq(idx) :+ y)        
      else if (qu==2) {
        var len = seq(idx).size
        lastAns=seq(idx)(y%len)
        println(lastAns)
      }       
    }     
  }
}