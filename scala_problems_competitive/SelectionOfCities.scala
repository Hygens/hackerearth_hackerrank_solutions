package com.hackerearth
object SelectionOfCities {
  def modExp(x: Long,n: Long):Long = {
    if (n == 0)  return 1
    else if (n%2==0) return modExp((x*x) % 1000000007,  n/2)
    else return (x * modExp((x*x) % 1000000007, (n-1)/2)) % 1000000007
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt
    while (t>0) {
      val n = lines.next().toLong
      println(modExp(2,n)-1)
      t-=1
    }        
  }
}