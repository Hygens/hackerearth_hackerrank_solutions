package com.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class TwoArraysAndMinimum {
public static void main(String[] args) {
		long M = 1000000007; 
		long a, b, c; int n;
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().trim().split(" ");
		a = Long.parseLong(nums[0]); 
		b = Long.parseLong(nums[1]);
		c = Long.parseLong(nums[2]);
		n = Integer.parseInt(sc.nextLine().trim());
		long[] A = new long[n+1]; A[1] = ((a%M)*c)%M;
		long[] B = new long[n+1]; B[1] = ((b%M)*c)%M;
		for(int i=2 ; i<=n ; i++)
		{
		    A[i] = (A[i-1]*(((a*b%M)*c)%M)) + (A[i-1]*(a*b%M))%M + (A[i-1]*(a*c%M))%M;
		    A[i] = A[i]%M;
		    B[i] = (B[i-1]*(((b*c%M)*a)%M)) + (B[i-1]*(b*a%M))%M + (B[i-1]*(b*c%M))%M;
		    B[i] = B[i]%M;
		}	
		Arrays.sort(A);
		Arrays.sort(B);		
		long sumA = A[1]+B[2];
		long sumB = B[1]+A[2];		
		if (sumA<sumB)
			System.out.println(sumA);					
		else 
			System.out.println(sumB);		
	}
}