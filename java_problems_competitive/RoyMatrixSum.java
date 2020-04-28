package com.tests;

import java.util.Scanner;

class RoyMatrixSum{

public static double rec(double N,double ac) 
{  
	if(N==0.0)
		return 0.0;		
	else { 	
		ac=ac==0.0?N*(N-1.0d):ac+N*(N-1);
		rec(N-1.0d,ac);
	}
	return ac;
}   

public static void main(String[] args)  
{  
    int t,i,j;
    double N=0,sum=0,ac=0;
    Scanner sc = new Scanner(System.in);  
    t=sc.nextInt();
    sc.nextLine();
    while(t-->0)  
    {  
     N=sc.nextLong();
     sum=rec(N,ac);  
     System.out.println(sum);
     sum = 0;
    }        
}  
}