package com.hackerearth

object SoftSort {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val base = 1000000007
    val T = lines.next().toInt
    val nums = lines.take(T).map(_.toInt).toArray
    val max = nums.max
    val cache = Array.fill(max+1)(0l)
    var c = 1l
    for(i <- 1 to max){
        c *= i;
        c %= base
        cache(i) = c
    }
    for(t <- 0 until T){
        var res = cache(nums(t))
        res *= 3
        res -= 2
        res += 5
        res %= base
        println(res)
    }
  }
}
