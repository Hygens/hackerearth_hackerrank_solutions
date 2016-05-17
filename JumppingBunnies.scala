package com.scala.examples

object JumppingBunnies {
    def gcd(a: Long, b: Long):Long=if (b==0) a.abs else gcd(b, a%b)
    def lcm(a: Long, b: Long):Long=(a/gcd(a,b))*b 
    def main(args: Array[String]) {
        var lines = io.Source.stdin.getLines
        var N: Int = lines.next.toInt;
        var J: Array[Long] = lines.next.split(" ").map(_.toLong);
        var LCM = J.reduceLeft(lcm)
        print(LCM);
    }   
}