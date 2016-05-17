package com.scala.examples

object Solution extends App { val lines = io.Source.stdin.getLines() ; val n = lines.next() ; println(lines.next().split(" ").reverse.mkString(" ")) }