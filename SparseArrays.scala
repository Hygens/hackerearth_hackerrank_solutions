package com.scala.examples

import scala.collection.mutable.Seq

object SparseArrays1 { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines() 
    val n = lines.next().toInt
    val s = lines.take(n).toList 
    val q = lines.next().toInt
    val ql = lines.take(q).toList
    for (search <- ql)
      println(s.count(_==search))      
  }
}