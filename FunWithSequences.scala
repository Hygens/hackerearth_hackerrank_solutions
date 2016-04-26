package com.scala.examples

import scala.collection.mutable.ListBuffer

object S99Int {
  def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n) 
  def isCoprimeTo(m:Int, n: Int): Boolean = (m,n) match {
   case (m,n) => gcd(m, n) == 1 
   case _ => false
  }
  def listCoprimesinList(l: List[Int]): List[Int] = {
      l.toList
  }
}

object FunWithSequences {  
  import S99Int._
  
  def main(args: Array[String]): Unit = {
      var l: List[Int] = readLine().split(" ").toList.map(_.toInt)
      l=l.sortWith(_<_)
      println(listCoprimesinList(l).
          toString().
          replace("List(", "").
          replace(",","").
          replace(")",""))
  }
}