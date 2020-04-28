package com.scala.examples
import scala.util.control.Breaks._
object GameOfStones_1 { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    val T = lines.next().toInt    
    for(i <- 0 until T) {
      var n= lines.next().toInt
      if (n%7<2) println("Second")
      else println("First")           
    }
  }
}