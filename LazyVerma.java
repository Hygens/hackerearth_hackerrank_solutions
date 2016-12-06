package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;
class FastIO15 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO15() {
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

public class LazyVerma {
	public static void main(String[] args) throws IOException {
		FastIO15 sc = new FastIO15();		
		int N = sc.nextInt(); int M = sc.nextInt();
		long[] A = new long[N]; long[] B = new long[M];
		long subsuma=0l,sumat=0l;
		for(int i=0;i<N;i++) { A[i] = sc.nextLong(); subsuma=subsuma+A[i]; }
		for(int i=0;i<M;i++) { B[i] = sc.nextLong(); sumat=sumat+(subsuma*B[i]);}			
		sc.print(sumat);
	}
}
