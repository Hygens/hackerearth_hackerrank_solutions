package com.scala.functional

object SieveEratostenesFunctional extends App {
    /**
   * @return Bitset p such that p(x) is true iff x is prime
   */
  def sieveOfEratosthenes(s: Int, n: Int) = {
    val isPrime = scala.collection.mutable.BitSet(s to n: _*)
    for (p <- s to Math.sqrt(n).toInt if isPrime(p)) {
      isPrime --= p*p to n by p
    }
    isPrime.toImmutable
  }
  // Sieving integral numbers
  def sieve(s: Stream[Int]): Stream[Int] = {
    s.head #:: sieve(s.tail.filter(_ % s.head != 0))
  }
  
  // Sieving integral numbers midified
  def sieve(s: Stream[Int],end: Int): Stream[Int] = {
    if (s.head<=end && s.head>1) s.head #:: sieve(s.tail.filter(_ % 2 != 0),end)
    else if (s.head<=end) sieve(s.tail,end)
    else Stream()
  }

  // All primes as a lazy sequence
  val primes = sieveOfEratosthenes(3,5)

  // Dumping the first five primes
  print(primes.toList) 
}