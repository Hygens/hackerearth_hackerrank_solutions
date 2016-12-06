package com.scala.examples
object YetAnotherMinimax {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    var b = lines.next().split(" ").map(_.toLong)    
    println(b.permutations.map{ x => x.sliding(2)
            .map{ case Array(x,y) => x^y }.toArray }
            .minBy(_.sum).max)      
  }
}