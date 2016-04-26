package com.scala.examples

object SubsetSum {
  def main(args: Array[String]) : Unit = {
    val N=readInt()
    val A=readLine().split(" ").toList.map(_.toLong)
    var T:Int=readInt()
    val L:List[List[Long]]=(1 to A.length flatMap (x => A.combinations(x))).toList.map( x => x )
    var S:Int=0
    while (T>0) {
      S = readInt()
      var comp = L.filter{ case s => (s.sum>=S) }
      if (comp.isEmpty) println(-1)
      else println(comp(0).size)
      T-=1
    }   
  }
}
