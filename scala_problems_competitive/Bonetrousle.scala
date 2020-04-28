package com.scala.examples
import util.control.Breaks._
import scala.collection.mutable.Buffer
object Bonetrousle {
  def func1(k: Int, b: Int): Int = {
    var tmp = 0
    if (b == 0) tmp = k
    else tmp = b
    (k * (k + 1) / 2) - ((k - tmp) * (k - tmp + 1) / 2)
  }
  def func2(k: Int, b: Int): List[Int] = {
    var tmp = 0
    if (b == 0) tmp = k
    else tmp = b
    (for {
      c <- (tmp - 1) to 0 by (-1)
      val v = k - c
    } yield v) toList
  }
  def main(arg: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt
    while (t > 0) {
      var n = 0; var k = 0 ; var b = 0
      val vars = lines.next().split(" ")
      n=vars(0).toInt ; k=vars(1).toInt
      if (vars.length==3) { b=vars(2).toInt }     
      breakable {
        if ((func1(k, b) < n) || (func1(b, 0) > n)) {
          println(-1)
          break
        }
        val spg = func1(k, b)
        var res = func2(k, b).toBuffer
        if (spg != n) {
            var offset = res.sum - n
            var index = 0
            while (offset > 0) {
                val org = res(index)
                if ((index+1) > (res(index) - offset)) res(index) = index+1
                else res(index) = res(index) - offset                
                offset -= org - res(index)
                index += 1
            }
        }
        println(res.mkString(" "))      
      }
      t-=1
    }    
  }
}