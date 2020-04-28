package com.tests;

import java.util.Scanner;

public class WooblyNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int n,k,a,b,x,i;  
		while(t-->0)  
		    {  
		     n=sc.nextInt(); k=sc.nextInt();  
		     if(k>81)  
		      System.out.println("-1\n");  
		     else  
		     {  
		      a=(int)Math.ceil((double)k/9.0);  
		      x=k-9*(a-1);  
		      b=x<=a?x-1:x;  
		      for(i=0;i<n;i++)  
		      {  
		       if((i&1)!=1)  
		        System.out.print(a);  
		       else  
		    	System.out.print(b);  
		      }  
		      System.out.println("");  
		     }  
		    }  
		    sc.close();

	}

}
