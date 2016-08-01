package com.spoj
object TheNextPalindrome extends App {
  def findPalindrome(input: String) = {
    val sides = split(input)
    val half = compareFromIndex(sides._1, sides._2.reverse, sides._1.length - 1)
    half
  }
  def split(s: String) = {
    val mid = (s.length)+1 / 2
    val left = s.substring(0, mid)
    val right = s.substring(s.length - mid, s.length)
    (left, right)
  }  
  @annotation.tailrec
  def compareFromIndex(left: String, right: String, i: Int): String = {
    if (i < 0) left
    else if (left(i) > right(i)) left
    else if (left(i) < right(i)) (BigInt(left) + 1).toString()
    else compareFromIndex(left, right, i - 1)
  }
  def getInput(times: Int) = {
    for (time <- 0 until times)
        findPalindrome(readLine()).foreach(println)
  }
  val times = readInt()
  getInput(times)
}