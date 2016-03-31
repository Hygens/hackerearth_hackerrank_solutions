package com.scala.examples

object SierpinskTriangles {
   var s: String=""
  
   def dfs(row: Int,col: Int,n: Int,k: Int,es: Array[String]): String = {
        if (n==0) return ""        
        var b=""
        for(i <- 0 until k) {
           b=es(row+i).substring(0,col+i)+"_"*(2*k-2*i-1)
           es(row+i)=b+es(row+i).substring(b.size)
        }
        dfs(row+k/2,col-k/2,n-1,k/2,es)
        dfs(row+k/2,col+3*k/2,n-1,k/2,es)
        dfs(row-k/2,col+k/2,n-1,k/2,es) 
        es.mkString("\n")
  }
  
  def calc(i: Int): Unit = {
    s+="_"*(31-i)+"1"*(2*i+1)+"_"*(31-i)+"\n"
  }


for(i <- 0 until 32) calc(i)      

val N=readInt()
val arr=s.split("\n")
if (N>0) s=dfs(16,16,N,16,arr)

   def main(args: Array[String]): Unit = 
       print(s)       
  
}