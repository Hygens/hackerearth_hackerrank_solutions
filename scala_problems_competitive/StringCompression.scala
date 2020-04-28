package com.scala.examples

//usr/bin/env scala $0 $@;exit
object StringCompression {
  def stripChars(s:String, ch:String)= s filterNot (ch contains _)
  def intersectStart(s1:String,s2:String)= { val pre=s1.toByte & s2.toByte ; pre }
	def main(args: Array[String]){
		val s1=readLine()
		val s2=readLine()
		var intersect=""; var strip1=""; var strip2=""
		if (s1.startsWith(s2)) {
		   intersect= s1.intersect(s2)
		   strip1=s1.replace(intersect,"")
		   strip2=""		
		} else if (s1.compareTo(s2)==0){
		  intersect=s1
		  strip1=""
		  strip2=""
		} else if (s1.length()/2<s2.length()) {
		  intersect= s1.substring(0, s1.length()/2).intersect(s2)
		  strip1=stripChars(s1,intersect)
		  strip2=stripChars(s2,intersect)
		} else if (s2.length()/2<s1.length()) {
		  intersect= s2.substring(0, s2.length()/2).intersect(s1)
		  strip1=stripChars(s1,intersect)
		  strip2=stripChars(s2,intersect)
		} else {
		  intersect= s1.intersect(s2)
		  strip1=stripChars(s1,intersect)
		  strip2=stripChars(s2,intersect)
		}
		println(s"${intersect.length()} ${intersect}")
		println(s"${strip1.length()} ${strip1}")
		println(s"${strip2.length()} ${strip2}")
	}
}