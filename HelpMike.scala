package com.scala.examples

object HelpMike {  
  var K=0
  def calc(i: Int,j: Int) : Int = (i,j) match {
    case (i,j) if (i < j && (i + j) % K == 0) =>  1
    case _ => 0
  }
  def main(args: Array[String]): Unit = {
    var T = readInt()
    var count=0
    while (T > 0) {
      val Array(n, k) = readLine().split(" ").map(_.toInt)
      K=k
      count+=(1 to n).combinations(2).toList.par.filter{
        case IndexedSeq(i,j) => (i < j && (i + j) % k == 0)}.size
      println(count)
      count=0
      T -= 1
//      println((1 to n).combinations(2).filter{
//        case IndexedSeq(i,j) => (i < j && (i + j) % k == 0)}.size)     
      
    }
  }
}