package com.hackerearth
object PrintHackerearth { 
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines()
    val n = lines.next().toInt
    val words = lines.next().trim
    var h , a , c, k , e, r , t = 0
    for(i <- 0 until n){
        val ch = words(i);        
        ch match {
            case 'h' => h += 1                
            case 'a' => a += 1                
            case 'c' => c += 1                
            case 'k' => k += 1               
            case 'e' => e += 1                
            case 'r' => r += 1               
            case 't' => t += 1  
            case _   => h += 0
        }
    }
    h /= 2;
    e /= 2;
    a /= 2;
    r /= 2;
    var res = h;
    if(a < res){
        res = a;
    }
    if(c < res){
        res = c;
    }
    if(k < res){
        res = k;
    }
    if(e < res){
        res = e;
    }
    if(r < res){
        res = r;
    }
    if(t < res){
        res = t;
    }
    println(res);       
  }
}