package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

class FastIO12 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO12() {
		br = new BufferedReader(new InputStreamReader(System.in));
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
}


public class KthAncestor {
	private static int N = 100001, LOGN = 17;
	static int jp[][] = new int[LOGN][N];

	public static void main(String[] args) throws IOException {
		FastIO12 input = new FastIO12();
		OutputStream out = System.out;
		int t = input.nextInt();
		Set<Integer> varr = new TreeSet<>();
		while (t-- > 0) {
			int p = input.nextInt();
			while (p-- > 0) {
				int x = input.nextInt();
				int y = input.nextInt();
				jp[0][x] = y;
				varr.add(x);
			}
			for (int k = 1; k < LOGN; k++)
				for (Integer y : varr)
					jp[k][y] = jp[k - 1][y] > 0 ? jp[k - 1][jp[k - 1][y]] : 0;

			int q = input.nextInt();
			while(q-- > 0) {
				int op = input.nextInt(), l = input.nextInt();
				if (op == 0) {
					int m = input.nextInt();
					jp[0][m] = l;
					for (int k = 1; k < LOGN; k++)
						jp[k][m] = jp[k - 1][m] > 0 ? jp[k - 1][jp[k - 1][m]] : 0;
					varr.add(m);
				} else if (op == 1) {
					for (int k = 0; k < LOGN; k++)
						jp[k][l] = 0;
					varr.remove(l);
				} else if (op == 2) {
					int m = input.nextInt();
					while (m > 0) {
						int k = 31 - Integer.numberOfLeadingZeros(m);
						m -= 1 << k;
						l = jp[k][l];
					}
					out.write((String.valueOf(l) + "\n").getBytes());
				}
			}
			varr.clear();
		}
	}
}