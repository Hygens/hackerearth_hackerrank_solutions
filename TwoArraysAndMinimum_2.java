package com.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class TwoArraysAndMinimum_2 {
	public static void main(String[] args) {
		long a, b, c; int n; long M = 1000000007;
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().trim().split(" ");
		a = Long.parseLong(nums[0]); 
		b = Long.parseLong(nums[1]);
		c = Long.parseLong(nums[2]);
		n = Integer.parseInt(sc.nextLine().trim());
		BigInteger[] A = new BigInteger[n+1]; A[0] = BigInteger.valueOf(a*c);
		BigInteger[] B = new BigInteger[n+1]; B[0] = BigInteger.valueOf(b*c);
		for(int i=1 ; i<=n ; i++)
		{
		    A[i] = A[i-1].multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(c));
		    A[i] = A[i].add(A[i-1].multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(b)));
		    A[i] = A[i].add(A[i-1].multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(c)));
		    A[i] = A[i].mod(BigInteger.valueOf(1000000007));
		    B[i] = B[i-1].multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(c));
			B[i] = B[i].add(B[i-1].multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(a)));
			B[i] = B[i].add(B[i-1].multiply(BigInteger.valueOf(b)).multiply(BigInteger.valueOf(c)));
			B[i] = B[i].mod(BigInteger.valueOf(1000000007));
		}	
		Arrays.sort(A);	Arrays.sort(B);
		BigInteger sumA = A[0].add(B[1]);
		BigInteger sumB = B[0].add(A[1]);		
		System.out.println(sumA.min(sumB));				
	}
}
