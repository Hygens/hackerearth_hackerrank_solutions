package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

public class LittleShinoandFibonacci_1 {	
	static BigInteger fibSum(long n){		
	    if (n == 1 || n == 0)  {
	    	return BigInteger.ZERO;
	    } else if (n == 2) {
	    	return BigInteger.ONE;
	    } else{
	    	n+=1;
	    	BigDecimal a = BigDecimal.valueOf(Math.sqrt(5)); 
	    	BigDecimal b = BigDecimal.ONE.add(a); 
	    	BigDecimal c = BigDecimal.ONE.subtract(a);
	    	BigDecimal e = b.pow((int)n).subtract(c.pow((int)n)).divide(BigDecimal.valueOf(2).pow((int)n).multiply(a));
	    	return e.subtract(BigDecimal.ONE).toBigInteger();	            
	    }
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n>0) {
			String[] line = br.readLine().trim().split(" ");
			long l = Long.parseLong(line[0]);
			long r = Long.parseLong(line[1]);
			BigInteger s1 = fibSum(l-1); 
			BigInteger s2 = fibSum(r);
			BigInteger s = s2.subtract(s1);
			s = s.mod(BigInteger.valueOf(10000));
			System.out.println(s.mod(BigInteger.valueOf(1000000007)));		
			n--;
		}
	}
}
