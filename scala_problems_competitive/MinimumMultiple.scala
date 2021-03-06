package com.scala.examples
object MinimumMultiple {
  def lcm(a: BigInt, b: BigInt):BigInt=(a/a.gcd(b))*b
  def main(args:Array[String]){
    val lines = io.Source.stdin.getLines
	  val siz=lines.next.toInt
		var a=lines.next.split(' ').map(BigInt(_))		
		val k=lines.next.toInt
		for(i<-0 until k) {
			var Array(o,l,r)=lines.next.split(' ')			 
			if (o.equals("Q")) {
			  var z=a.slice(l.toInt,r.toInt+1)
			  var m=z.reduceLeft(lcm)		  
			  println(m.mod(1000000007))
			}
			else if (o.equals("U")) {
			  a(l.toInt)=a(l.toInt)*r.toInt
			}
		}		
	}
}