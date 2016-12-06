package com.hackerearth
object AdditionAintSimple { 
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val t = lines.next().toInt
    for (u <- 0 until t) {
        var line = lines.next().trim().toCharArray()
        val n = line.size
        for (i <-0 until ((n + 1)/2)) {
            val j = n - 1 - i
            var inc = (line(i) - 'a' + 1 + line(j) - 'a' + 1) % 26 - 1
            if (inc < 0)
                inc += 26
            val ch = (inc + 'a').toChar
            line(i) = ch
            line(j) = ch
        }
        println(line.mkString(""))
    }       
  }
}