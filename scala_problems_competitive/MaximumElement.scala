package com.scala.examples

import scala.collection.mutable.Stack
object MaximumElement { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines() 
    var n = lines.next().toInt
    var stack = Stack[Int]()
    while (n>0) {
      val q=lines.next().split(" ").map(_.toInt)
      if (q(0)==2) stack.pop()
      else if (q(0)==3) println(stack.max)
      else stack.push(q(1))     
      n-=1
    }    
  }
}