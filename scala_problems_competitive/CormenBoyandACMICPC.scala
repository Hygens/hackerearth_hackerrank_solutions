package com.hackerearth
import scala.collection.mutable.Buffer
object CormemBoyandACMICPC {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var Array(n,k) = lines.next().split(" ").map(_.toInt)
    val max_sum = Buffer[BigInt]()
    val all_list = Buffer[Buffer[BigInt]]()
    while (k>0) {
      var m = n/2
      val line = lines.next().split(" ").map(BigInt(_)).toBuffer
      var l1 = line.take(m)
      var l2 = line.drop(m)      
      var s: BigInt = 0
      while (m>0) {
        if (l1.size+l2.size!=line.size && line.size%2==0) {
          l1 = line.take(line.size/2)
          l2 = line.drop(line.size/2)                     
        } else if (l1.size+l2.size!=line.size && line.size%2!=0) {
          l1 = line.take(line.size/2)
          l2 = line -- l1           
        }
        if (l1.max>l2.max) { s+=l1.max ; line-=l1.max }
        else { s+=l2.max ; line-=l2.max }
        m-=1
      }
      max_sum.append(s)
      k-=1
    }
    println(max_sum.max)    
  }
}