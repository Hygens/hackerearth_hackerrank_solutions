package com.scala.examples

object XsquareAndList {        
    def minor(l: List[List[Long]], k: Long): Int = {
      val len = l.size
      val list: List[Int]=for (i <- List.range(0, len) if l(i)(0)<k) yield i      
      return list.size;
    }
    
    def major(l: List[List[Long]], k: Long): Int = {
      val len = l.size
      val list: List[Int]=for (i <- List.range(0, len) if l(i)(0)>k) yield i
      return list.size;
    }
    
    def equal(l: List[List[Long]], k: Long): Int = {
      val len = l.size
      val list: List[Int]=for (i <- List.range(0, len) if l(i)(0)==k) yield i
      return list.size;
    }
  
    def main(args: Array[String]) {
        var N: Long=0 ;  var Q: Long=0 
        val action: String="" ; val k: String=""
        val tokens = readLine().split(" ")
        N=tokens(0).toLong ; Q=tokens(1).toLong
        val inp = (readLine().split(" ").map(_.toLong)).sortWith(_>_)
        var l: List[List[Long]]=inp.toSet[Long].subsets.map(_.toList).toList
        l=List(List[Long](0)):::l.drop(1);    
        while (Q-(1)>0) 
        {  
           val Array(action,k) = readLine().split(" ").map(_.toString)
           val K = k.toLong 
           var count=0
           if(action=="<")              
              count=minor(l,K)               
           if(action==">")  
              count=major(l,K)
           if(action=="=") 
              count=equal(l,K)
           println(count)             
        }        
    }
  
}