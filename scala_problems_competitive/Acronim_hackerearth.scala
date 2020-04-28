package com.scala.examples
object Acronim {
  def f(n:Long)=n.toBinaryString.count(_=='1')
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val k = lines.next().toInt
    val dislikes = lines.take(k).toBuffer
    val nwords = lines.next().toInt
    var words = lines.next()
    for(word <- dislikes) {
      val before = " "+word
      val after = word+" "
      words = words.replace(after," ").replace(before," ").replace("  "," ").trim()     
    }    
    var acronim = ""
    for(word <- words.split(" ")) acronim+=word(0).toUpper+"."
    println(acronim.substring(0,acronim.size-1))   
  }
}