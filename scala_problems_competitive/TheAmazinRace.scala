package com.hackerearth
import scala.collection.mutable.Buffer
object TheAmazinRace {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().trim().toInt
    while (t > 0) {
      val n = lines.next().trim().toInt
      val a = lines.next().trim.split(" ").map(_.toLong).toBuffer
      a.prepend(0)
      val b = Buffer.fill(n + 1)(0)
      if (n > 1) {
        for (i <- 1 to n) {
          var s = 0
          if (i == 1) {
            val major_index = a.indexWhere(x => x >= a(i),i+1)
            if (major_index>=1) b(i) = (major_index-1)*i  
            else b(i) = (n-1)*i
          } else if (i>1 && i<n) {
            val reverse = a.slice(0,i).reverse
            val major_index = a.indexWhere(x => x >= a(i),i+1)
            if (major_index>=1) s+=major_index-i
            else s+=n-i
            val minor_index = reverse.indexWhere(x => x >= a(i),0)
            if (minor_index>=1) s+=minor_index+1
            else s+=i-1
            b(i) = s*i            
          } else if (i==n) {
            val reverse = a.slice(0,i).reverse
            val minor_index = reverse.indexWhere(x => x >= a(i),1)
            if (minor_index>=1) s+=minor_index
            else s+=i-1
            b(i) = s*i  
          }
        }
        println(b)
        println(b.indexOf(b.max))
      } else {
        println(1)
      }
      t -= 1
    }
  }
}
