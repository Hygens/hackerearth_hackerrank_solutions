package com.scala.examples
import scala.collection.mutable.Buffer
object KittyAndKatty { 
  def gamerWin(n: Int,last: String):String= {
    var gamer=""
    val reminder = n%3
    if (reminder==1) gamer="Kitty"
    else if (reminder==2) gamer="Katty"
    else if (reminder==0) gamer=last
    gamer
  }
  def main(args:Array[String]):Unit = {
    val lines = io.Source.stdin.getLines()
    var T = lines.next().toInt 
    var turns = Buffer[String]()
    val N = lines.take(T).toList.map(_.toInt)
    for(n <- N) {               
       var gamer = "Kitty"
       var game = Buffer[Int]()
       if (n>1) {   
         game = (1 to n).toBuffer         
         while (game.size>1) {
           turns.append(gamer)         
           var a = 0 ; var b = 0             
           if (gamer.equals("Kitty")) { 
             a = game.max ; b = game.min                                       
             gamer="Katty"
           }
           else {
             a = game.min ; b = game.max
             gamer="Kitty"
           }
           game-=a ; game-=b
           game.append(a-b)           
         }   
         println(gamerWin(game.head.abs,turns.last))       
         turns.clear()
       } else {
         println(gamerWin(n,"Kitty"))       
         turns.clear()
       }        
    }    
  }
}