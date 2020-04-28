package com.scala.examples

object Mangoes {
  var a: Array[Int]=Array()
  var h: Array[Int]=Array()
  var s: Array[(Int,Int)]=Array()
  var slc: Array[(Int,Int)]=Array()
  var k=0 ; var count=0
  def f(v: Int,j:Int) = { v+(k-1)*j }
  def resolv(N:Long,M:Long): Unit = {
    var tot=0
    for(i <- 1 to N.toInt) {
        k=i;  
        if (k==1 && s(k-1)._1>M) { count=0 ; return }
        if (k>1) 
          tot=s.slice(0,k).map{ case (v,j) => f(v,j) }.sum 
        else 
          tot=s(i-1)._1
        if (tot <= M) 
          count=i
        else 
          return
    }
  }
  def main(args: Array[String]) : Unit = {
    val Array(n,m)=readLine().split(" ").map(_.toLong)
    a=readLine().split(" ").map(_.toInt)
    h=readLine().split(" ").map(_.toInt)
    s=(a zip h).toArray.sortWith(_._2<_._2)
    resolv(n,m)
    println(count)
  }
}
