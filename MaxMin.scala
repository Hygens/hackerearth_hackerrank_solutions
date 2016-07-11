package com.scala.examples
object MaxMin {
 def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(n, k) = lines.take(2).toArray.map(_.toInt)   
    var array = lines.take(n).toArray.map(_.toLong).sortWith(_<_)
    val diffmin = array.take(k).sliding(k).map(x => x.last-x.head).min
    println(diffmin)    
  }
}