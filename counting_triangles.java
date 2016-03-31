package com.tests;

import java.util.Scanner;

class counting_triangles {
	
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		long N;
		long K;
		for(int x=0;x<T;x++) {
			N=sc.nextLong();
			K=N==0?0:8*N+6*(N-1);
			System.out.println(K);
		}
		sc.close();
    }
	
}