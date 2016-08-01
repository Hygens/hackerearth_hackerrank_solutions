package com.scala.examples
import scala.util.control.Breaks._
object GameOfStones { 
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    val T = lines.next().toInt    
    for(i <- 0 until T) {
       var n=lines.next().toInt 
       var gamer = "First"
       breakable {
       while (n>=1) {
           if (n==1) {
             if (gamer.equals("First")) gamer="Second"
             else gamer="First"
             break
           }
           else if (n>5 && n%5>=1) n-=5
           else if (n>3 && n%3>=1) n-=3
           else if (n>2 && n%2>=1) n-=2
           else if (n==2) {
             if (gamer.equals("First")) gamer="First"
             else gamer="Second"
             break
           }        
           if (gamer.equals("First")) gamer="Second"
           else gamer="First"
      }  
      }
      println(gamer)        
    }
  }
}