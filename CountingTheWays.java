package com.tests;

import java.math.BigInteger;
import java.util.*;
public class CountingTheWays {
	static BigInteger M = BigInteger.valueOf(1000000007);
	public static BigInteger result(int[] v, int min, int weight) {		
		BigInteger[][] arr = new BigInteger[v.length + 1][weight + 1];		
		for (int i = 0; i <= v.length; i++) {
			arr[i][0] = BigInteger.valueOf(1);
		}		
		for (int i = 1; i <= weight; i++) {
			arr[0][i] = BigInteger.ZERO;
		}
		for (int i = 1; i <= v.length; i++) {
			for (int j = 1; j <= weight; j++) {				
				if (v[i - 1] <= j) {					
					arr[i][j] = arr[i - 1][j].add(arr[i][j - v[i - 1]]) ;
				} else {					
					arr[i][j] = arr[i - 1][j];
				}
			}
		}		
		return Arrays.asList(arr[v.length]).subList(min, weight+1).stream().reduce(BigInteger.ZERO,BigInteger::add);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine().trim());
		int[] vals = Arrays.asList(in.nextLine().trim().split(" "))
				.stream()
				.mapToInt(Integer::parseInt)
				.toArray();	
		String[] lr =in.nextLine().trim().split(" ");
		long l = Long.parseLong(lr[0]);
		long r = Long.parseLong(lr[1]);
		BigInteger res = result(vals, (int)l,(int)r);
		System.out.println(res.mod(M));
	}
}