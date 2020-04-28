package com.scala.examples
object KittyAndKatty2 { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    var T = lines.next().toInt 
    val vals = lines.take(T).toList.map(_.toInt)
    for(n <- vals) {               
       if (n%2==0 || n==1) println("Kitty")
       else println("Katty")
    }    
  }
}