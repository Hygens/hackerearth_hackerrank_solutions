package com.scala.examples
import scala.collection.mutable.Buffer
object ArrayAndSimpleQueries2 {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val Array(n, m) = lines.next().split(" ").map(_.toInt)
    var array = lines.next().split(" ").toBuffer
    var tmp = Buffer[String]()
    for (x <- 0 until m) {
      val Array(qu, i, j) = lines.next().split(" ").map(_.toInt)
      tmp = array.slice(i - 1, j); array.remove(i - 1, j - i + 1)
      if (qu == 1) array.prependAll(tmp) 
      else  array.appendAll(tmp) 
    }
    println((array(0).toInt - array.last.toInt).abs)
    println(array.mkString(" "))
  }
}