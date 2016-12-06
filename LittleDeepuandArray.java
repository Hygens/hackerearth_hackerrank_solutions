package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;
class FastIO16 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO16() {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = System.out;
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	Long nextLong() {
		return Long.valueOf(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	void print(Object o) throws IOException {
		out.write(String.valueOf(o).getBytes());
	}

	void println(Object o) throws IOException {
		out.write((String.valueOf(o) + "\n").getBytes());
	}
}

public class LittleDeepuandArray {
	public static void main(String[] args) throws IOException {
		FastIO16 sc = new FastIO16();		
		int N = sc.nextInt(); long[] A = new long[N];
		for(int i=0;i<N;i++) { A[i] = sc.nextLong(); }
		int M = sc.nextInt();
		while(M-->0) {
			long X = sc.nextLong();
			for(int i=0;i<N;i++) { if(A[i]>X) A[i]--; }
		}		
		for(int i=0;i<N;i++) { sc.print(i==N-1?A[i]:A[i]+" "); }		
	}
}
