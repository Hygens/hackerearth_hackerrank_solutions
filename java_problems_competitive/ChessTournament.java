package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO8 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO8() {
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

public class ChessTournament {
	public static void main(String args[]) throws Exception {
		FastIO8 br = new FastIO8();
		int N = br.nextInt();
		int n = 1 << N;
		int total = n * (n - 1) / 2;
		int[] table = new int[total];
		for (int i = 0; i < total; i++) {
			table[i] = br.nextInt();
		}
		int[] match = new int[n];
		for (int i = 0; i < n; i++) {
			match[i] = 1;
		}
		for (int i = 1; i <= N; i++) {
			int a = -1, b = -1;
			for (int j = 0; j < n; j++) {
				if (match[j] != 0) {
					if (a < 0) {
						a = j + 1;
					} else if (b < 0) {
						b = j + 1;
						int pos = (b - 2) * (b - 1) / 2 + a - 1;
						int r = table[pos];
						if (r == 1) {
							match[a - 1] = 0;
						} else {
							match[b - 1] = 0;
						}
						a = -1;
						b = -1;
					}
				}
			}
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (match[i] == 1) {
				res = i + 1;
			}
		}
		br.println(res);
	}
}
