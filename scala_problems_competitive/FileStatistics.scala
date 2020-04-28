package com.hackerearth
import sys.process._
import java.text.SimpleDateFormat
import scala.io.BufferedSource
import java.io.FileNotFoundException
object FileStatistics {                                          
  def main(args: Array[String]) = {
    val inputFileName = io.Source.stdin.getLines().next()
    var file : BufferedSource = null
    try {
      file = scala.io.Source.fromFile(inputFileName)
    } catch {
      case e: FileNotFoundException => e.printStackTrace()
    }
    val lines = file.getLines().toList
    val nlines = lines.size
    println(nlines)   
    val words = lines.mkString(" ")
    val nwords = words.split(" ").size
    println(nwords)
    val nchars = words.replace(" ","").length();
    println(nchars)
    val fileinfo = (Process("ls -n "+inputFileName).!!).split(" ")
    println(fileinfo(2))
    println(fileinfo(3))
    val format: SimpleDateFormat = new SimpleDateFormat("MMM dd hh:mm")
    println(format.parse(fileinfo(5)+" "+fileinfo(6)+" "+fileinfo(7)).getTime()/1000)
  }
}
