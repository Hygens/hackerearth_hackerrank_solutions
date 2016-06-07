package com.hackerearth
object CalculateThePower {
  def modExp(x: Long,n: Long):Long = {
    if (n == 0)  return 1
    else if (n%2==0) return modExp((x*x) % 1000000007,  n/2)
    else return (x * modExp((x*x) % 1000000007, (n-1)/2)) % 1000000007
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var Array(a,b) = lines.next().split(" ").map(_.toLong)
    println(modExp(a,b))       
  }
}