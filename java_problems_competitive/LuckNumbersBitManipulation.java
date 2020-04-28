package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LuckNumbersBitManipulation {
	private static long M = 1000000007;
	static long numberGen(long n){
		long s = 0;    
	    for (int i=4; i<=n; i++) 
	        for (int j=0; j<i-1; j++) {
	            long v = (long) (Math.pow(2, j)+Math.pow(2, i-1));
	            if (v<=n)
	                s += v;
	            else
	                break;
	        }
	    return s;
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-->0) {
			long n = Long.parseLong(br.readLine());
			long soma=0;
		    if (n==1 || n==2) System.out.println(0);
		    else if (n==3 || n==4) System.out.println(3);
		    else if (n==5) System.out.println(8);
		    else if (n==6) System.out.println(14);
		    else { 
		        soma=14+numberGen(n);
		        System.out.println(soma%M); 
		    }		    
		}		
	}
}
