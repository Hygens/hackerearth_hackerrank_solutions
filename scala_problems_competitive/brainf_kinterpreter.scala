package com.scala.examples

import java.io.IOException;

object BrainF extends App {
  var buffer: Array[Int] = Array.fill[Int](99999)(0)
  var ptr = 0
  var inpptr = 0
  var inst = 0
  var inp: String = ""
  def execute(s: String): Unit = {
    var i = 0
    while (i<s.length) {
      if (s.charAt(i)=='>') {
        ptr+=1; inst+=1
      } else if (s.charAt(i)=='<') {
        ptr-=1; inst+=1
      } else if (s.charAt(i)=='+') {
        buffer(ptr)+=1; inst+=1
      } else if (s.charAt(i)=='-') {
        buffer(ptr)-=1; inst+=1
      } else if (s.charAt(i)=='.') {
        inst+=1
        if (inst>100000) { throw new IOException }
        var c = buffer(ptr).toChar
        print(c)
      } else if (s.charAt(i)==',') {
        inst+=1
        if (inst>100000) { throw new IOException }
        buffer(ptr)=inp(inpptr).toInt; inpptr+=1
      } else if (s.charAt(i)=='[') {
        inst+=1
        if (buffer(ptr)!=0) { execute(s.slice(i+1, s.length)) }
        var marker=1
        while (marker>0) {
          if (s(i+1)=='[') { marker+=1 }
          if (s(i+1)==']') { marker-=1 }
          i+=1
        }
      } else if (s.charAt(i) == ']') {
        inst+=1
        if (buffer(ptr)!=0) {
          inst += 1
          i-=1
        } else { return }
      }
      i+=1
      if (inst>100000) { throw new IOException }
    }
  }
  val Array(n, m) = readLine().split(" ").map(_.toInt)
  var input = readLine()
  input = input.reverse.dropWhile(_ == ' ').reverse
  if (!input.isEmpty() && input.length() > 1) inp = input.slice(0, input.length() - 1) else inp = ""
  var prog: String = ""
  for (x <- 0 until m) { prog += readLine() }
  try {
    execute(prog)
  } catch {
    case ex: IOException => {
      print("PROCESS TIME OUT. KILLED!!!")
    }

  }
}