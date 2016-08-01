package com.spoj
import scala.util.control.Breaks._
/*
 * Solution: Count all prime numbers smaller than sqrt 1000000000 (31622) so we 
 * have an array a(1..3401) of prime nb 
 * for each nb x from m - n, if x mod any nb from array a = 0 
 * then it's not a prime nb 
 */
object PrimeGenerator extends App {
  def sieve(s: Stream[Int]): Stream[Int] = {
    if (s.head > 1) s.head #:: sieve(s.tail.filter(_ % s.head != 0))
    else if (s.head == 1) sieve(s.tail)
    else Stream()
  }
  val lines = io.Source.stdin.getLines()
  val n = lines.next().toInt
  for(_ <- 0 until n) {
    val s = lines.next().split(" ").map(_.toInt)
    val si = sieve(Stream.from(2))
    si.takeWhile(x => x>=math.sqrt(s(1)).toInt).foreach{ x => 
      breakable{ for(y <- s(0) to s(1)) 
        if (x>=s(0) && BigInt(x).gcd(BigInt(y))==1) { println(x) ; break }
      }  
    }    
  }
}