package com.scala.examples

import annotation.tailrec

object RoyAndMatrixSum {        
   def compute(N: Long): Long = {
      var sum: Long=0
      @tailrec
      def inner(N: Long): Long = {
        if (N == 0) 0
        else {
          sum=sum+N*(N-1)
          inner(N-1)          
        }        
      }
      if (N == 0) 0
      else {
        sum=N*(N-1)
        inner(N-1)
      }
      return sum
   } 
  
    def main(args: Array[String]) {
        var t,i,j: Int=0
        var N,sum: Long=0
        t=readLine().toInt
        while (t>0) 
        {  
           N=readLine().toLong
           sum=compute(N)  
           System.out.println(sum)
           sum = 0
           t=t-1
        }        
    }
  
}