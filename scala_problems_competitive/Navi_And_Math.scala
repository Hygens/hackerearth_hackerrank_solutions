package com.hackerearth
import scala.math.BigInt
object NaviAndMath {   
  def main(args: Array[String]): Unit = {
      val lines = io.Source.stdin.getLines()
      val M:BigInt=BigInt(1000000007)
      val T=lines.next().toInt
      for(i <- 1 to T) {
        val N=lines.next().toInt        
        val l = lines.next().split(" ").map(BigInt(_)).toList
        val r: IndexedSeq[BigInt]=(for{x<-2 to N 
          e=l.view.combinations(x).map(x => x.product/x.sum)                   
        } yield e).flatten.sortWith(_<_)
        val res= r.partition(x => x<=M)._1.last%M
        println("Case #"+i.toString()+": "+res.toString())        
      }      
  }
}