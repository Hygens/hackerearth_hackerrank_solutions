package com.hackerearth
object TwoArraysAndMinimum {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val M = 1000000007
    val Array(a,b,c) = lines.next().split(" ").map(BigInt(_))
    var n = lines.next().toInt
    var A = Array.fill[BigInt](n)(0) ; A(0) = a*c
		var B = Array.fill[BigInt](n)(0) ; B(0) = b*c
		for(i <- 1 until n)
		{
		    A(i) = A(i-1)*a*(b*c + b + c)
		    A(i) = A(i)%M
		    B(i) = B(i-1)*b*(c*a + a + c)
		    B(i) = B(i)%M
		}	
		A = A.sorted
		B = B.sorted
		val sumA = A(0)+B(1)
		val sumB = B(0)+A(1)	
		if (sumA<sumB)
			println(sumA);					
		else 
			println(sumB);
  }
}