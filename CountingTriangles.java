package com.tests;

import java.math.BigInteger;
import java.util.Scanner;

public class CountingTriangles {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		int N;
		BigInteger K;
		for(int x=0;x<T;x++) {
			N=Integer.parseInt(sc.nextLine());
			K=BigInteger.valueOf(8*N+6*(N-1));
			System.out.println(K.toString());
		}
		sc.close();
	}

}
