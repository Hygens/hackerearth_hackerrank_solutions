package com.scala.examples
import scala.util.control.Breaks._

object FindPairs {
   def junk(x:Int,y:Int,A:List[Int]):(Int,Int) = {
     var r = (0,0) ; if (y<x && A(y)==A(x)) r=(x,y)
     r      
   }
   def main(args: Array[String]): Unit = {
    val N=readInt()
    var A:List[Int] = readLine().split(" ").map(_.toInt).toList
    var L:List[(Int,Int)] = A.flatMap(x => A.map(y => junk(x,y,A)))
    println(L.toString)
//    var L:List[(Int,Int)] = for((i,j) <- A zip A.tail 
//        if (j<i && A(j)==A(i)) 
//    ) yield (i,j)
//    println(L.length)    
  }
}