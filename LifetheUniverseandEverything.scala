package com.spoj

object LifetheUniverseandEverything {
  def main(args:Array[String]) {
    io.Source.stdin.getLines().takeWhile{ x => !x.equals("42") }.foreach(println)
  }
}