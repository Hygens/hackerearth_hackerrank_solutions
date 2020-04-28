package com.scala.examples

import scala.collection.mutable.TreeSet
import scala.math.BigInt

object TreeInScala {
  def main(args:Array[String]):Unit = {
    var tree = new TreeSet[BigInt]()
    for (i <- 1000000 to 1 by -1) tree.add(BigInt(i))
    println(tree.size)
    println(tree.sum)
    println(tree.product)
    println(tree.ordering.toString())
    println(tree.max)
    println(tree.min)
  }  
}