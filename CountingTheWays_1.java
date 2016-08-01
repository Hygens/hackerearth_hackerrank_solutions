package com.tests;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.*;
class A2DArray {
	private long address;
	private final static int LONG_BYTE_SIZE = 8;
	public static sun.misc.Unsafe getUnsafe() {
		try {
			Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			return (sun.misc.Unsafe) f.get(null);
		} catch (Exception e) {
			System.err.println("Error obtaining unsafe: " + e.getMessage());
			return null;
		}
	}
	public A2DArray(long size) {
		address = getUnsafe().allocateMemory(size * LONG_BYTE_SIZE);
	}
	public void set(long idx, long val) {
		getUnsafe().putLong(address + idx * LONG_BYTE_SIZE, val);
	}
	public long get(long idx) {
		return getUnsafe().getLong(address + idx * LONG_BYTE_SIZE);
	}
	public void free() {
		getUnsafe().freeMemory(address);
	}
}
public class CountingTheWays_1 {
	static BigInteger M = BigInteger.valueOf(1000000007);
	public static BigInteger result(int[] v, long min, long weight) {		
		long[] vls = new long[v.length]; A2DArray arr = new A2DArray(weight+10);
		for (int i = 0; i <= v.length; i++) {
			vls[i] = 1L;
		}		
		for (long i = 1; i <= weight; i++) {
			arr.set(i, 0l);
		}
//		for (int i = 1; i <= v.length; i++) {
//			for (long j = 1; j <= weight; j++) {				
//				if (v[i - 1] <= j) {	
//					arr[i][j] = arr[i - 1][j].add(arr[i][j - v[i - 1]]) ;
//				} else {					
//					arr[i][j] = arr[i - 1][j];
//				}
//			}
//		}		
//		return Arrays.asList(arr[v.length]).subList(min, weight+1).stream().reduce(BigInteger.ZERO,BigInteger::add);
		return null;
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