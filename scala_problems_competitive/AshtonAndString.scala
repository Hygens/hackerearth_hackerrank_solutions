package com.scala.examples
import scala.util.control.Breaks._
object AshtonAndString {  
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    var t = lines.next().toInt
    var str = Array[String]()
    while (t>0) {
      val a = lines.next()
      val k = lines.next().toInt
      breakable { (1 to a.size).view.foreach{ x => if (str.size<=k) {
        val vw = a.view.sliding(x).toArray.map(_.mkString(""))
        str=vw ++ str } else break } 
      }
      str = str.sorted
      println(str.mkString("")(k-1))      
      t-=1
    }  
  }
}