package com.tests;

import java.util.Scanner;

class BigPAndMath{
	public static int strToInt(String str) {
		int i = 0;
		int num = 0;
		boolean isNeg = false;
		if (str.charAt(0) == '-') {
			isNeg = true;
			i = 1;
		}
		while (i < str.length()) {
			num *= 10;
			num += str.charAt(i++) - '0';
		}
		if (isNeg)
			num = -num;
		return num;
	}
	public static void main(String[] args) {
		String A, B;
		int min = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		A = nums[0]; A = A.replaceAll("6", "5");
		B = nums[1]; B = B.replaceAll("6", "5");
		min = strToInt(A) + strToInt(B);
		A = A.replaceAll("5", "6"); B = B.replaceAll("5", "6");
		max = strToInt(A) + strToInt(B);
		System.out.println(min + " " + max);
	} 
}