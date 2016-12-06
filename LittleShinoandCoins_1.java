package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO5 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO5() {
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

public class LittleShinoandCoins_1 {
	public static void main(String args[]) throws Exception {
		FastIO5 br = new FastIO5();
		int k = br.nextInt();
		char[] ws = br.nextLine().toCharArray();
		int size = ws.length;
		long res = 0;
		int[] cnt = new int[26];
		for (int i = 0; i < size; i++) {
			int end = i + k - 1;
			if (end >= size) {
				break;
			}
			for (int j = 0; j < 26; j++) {
				cnt[j] = 0;
			}
			int count = 0;
			for (int j = i; j < end; j++) {
				char now = ws[j];
				int idx = now - 'a';
				if (cnt[idx] == 0) {
					count = count + 1;
					cnt[idx] = 1;
				}
			}
			for (int j = end; j < size; j++) {
				char now = ws[j];
				int idx = now - 'a';
				if (cnt[idx] == 0) {
					count = count + 1;
					cnt[idx] = 1;
					if (count > k) {
						break;
					}
				}
				if (count == k) {
					res = res + 1;
				}
			}
		}
		br.println(res);
	}
}
