package com.hackerearth

object DeaththeMultiverseandNothing {
   def main(args: Array[String]) {
        val lines = io.Source.stdin.getLines
        lines.take(lines.next().toInt).foreach( 
          x => println(x.toInt-1)
        )
    }
}