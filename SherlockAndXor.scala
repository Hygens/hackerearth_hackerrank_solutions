package com.scala.examples
import scala.collection.mutable.BitSet
object SherlockAndXor {  
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var T = lines.next().toInt
    while (T>0) {
      val n = lines.next().toInt
      val a = lines.next().split(" ").map(_.toInt)
      val cnt = a.combinations(2).filter{ case x => x(0).^(x(1))%2!=0 }.size
      println(cnt) 
      T-=1
    }
  }
}