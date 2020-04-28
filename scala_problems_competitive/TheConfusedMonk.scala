package com.hackerearth
object TheConfusedMonk {
  def gcd(a: BigInt, b: BigInt): BigInt = a.gcd(b)
  def modExp(x: BigInt,n: BigInt):BigInt = {
    if (n == 0)  return 1
    else if (n%2==0) return modExp((x*x) % 1000000007,  n/2)
    else return (x * modExp((x*x) % 1000000007, (n-1)/2)) % 1000000007
  }
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var n = lines.next().toInt
    val line = lines.next().split(" ").map(BigInt(_))
    val g: BigInt = line.reduceLeft(gcd)
    val f = line.product
    println(modExp(f,g))       
  }
}