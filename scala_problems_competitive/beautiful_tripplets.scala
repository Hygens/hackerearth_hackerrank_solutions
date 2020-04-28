package com.scala.examples


object BeautifulTriplets { 
   def main(args:Array[String]):Unit ={      
      val Array(n,d)=readLine().split(" ").map(_.toInt)
      var a =readLine().split(" ").map(_.toInt).sortWith(_<_) 
      var count=0
      for (i <- 0 until n) {
			    for (j <- i+1 until n) {
			      if(a(j)-a(i)==d) {  
			        for (k <- j+1 until n) {
			           if(a(k)-a(j)==d) count+=1;
			        }
			      }
			    }			    	   
			}
      println(count)            
  }
}

// for (Array(i,j,k) <- a) { if ((j-i==d) && (k-j==d)) count+=1 }
      