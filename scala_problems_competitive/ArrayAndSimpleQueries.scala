package com.scala.examples

object ArrayAndSimpleQueries { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines() 
    val Array(n,m) = lines.next().split(" ").map(_.toInt) 
    var array = lines.next().split(" ")
    for (x <- 0 until m) {
      val Array(qu,i,j)=lines.next().split(" ").map(_.toInt)
      if (qu==1) array=array.slice(i-1,j) ++ array.slice(0,i-1) ++ array.drop(j)        
      else array=array.slice(0,i-1) ++ array.drop(j) ++ array.slice(i-1,j)
    } 
    println((array(0).toInt-array.last.toInt).abs)
    println(array.mkString(" "))
  }
}