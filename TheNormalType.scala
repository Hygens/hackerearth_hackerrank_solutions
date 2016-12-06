package com.hackerearth
import scala.collection.mutable.Map
import scala.util.control.Breaks._
object TheNormalType {
  def main(args: Array[String]) = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    var A = lines.next().split(" ").map(_.toLong)
    var S = A.toSet
    val k = S.size
    var counts = Map[Long,Long]()
    for(e <- S){
        counts(e) = 0
    }
    var res = 0
    var count = 0
    var a=0; var b = 0
    breakable{ for(a <- 0 until n){
        if(a == 0){
            b = -1
        }else{
            var num = A(a - 1)
            counts(num) -= 1
            if(counts(num) <= 0){
                count -= 1
            }
        }
        while(count < k && b + 1 < n){
            b += 1
            var num = A(b)
            if(counts(num) <= 0){
                count += 1
            }
            counts(num) += 1
        }
        if(count < k){
            break
        }
        res += (n - b)
    } }
    println(res)
  }
}