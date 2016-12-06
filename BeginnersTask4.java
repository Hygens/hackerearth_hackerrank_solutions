package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO12 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO12() {
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

	long nextLong() {
		return Long.parseLong(next());
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

public class BeginnersTask4 {
	public static void main(String[] args) throws IOException {
		FastIO12 sc = new FastIO12();		
		int T = sc.nextInt();
		while (T-- > 0) {
			long[] A = new long[101];
			long K, M, W, product = 1, temp;
			int N = sc.nextInt();
			K = sc.nextLong();
			M = sc.nextLong();
			W = sc.nextLong();
			for (int i = 0; i < N; i++) {
				A[i] = sc.nextLong();
			}
			for (int i = 0; i < N; i++) {
				product = product * A[i];
				product = product % W;
				if ((i + 1) % K == 0) {
					temp = product;
					for (int j = 1; j < M; j++) {
						product = (product * temp) % W;
					}
				}

			}
			sc.println(product);
		}
	}
}
