package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO3 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO3() {
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

	void print(Object s) throws IOException {
		out.write(String.valueOf(s).getBytes());
	}

	void println(Object s) throws IOException {
		out.write((String.valueOf(s) + "\n").getBytes());
	}
}

public class LittleShinoandCoins {
	static int count_all_refs(String input_string, int k) {
		int length = input_string.length();
		int s = 0;
		int i = 0;
		while (i < length - k + 1) {
			int j = i + k - 1;
			while (j < length) {
				if (input_string.subSequence(i, j + 1).chars().distinct().count() == k)
					s++;
				j++;
			}
			i++;
		}
		return s;
	}

	public static void main(String args[]) throws Exception {
		FastIO3 br = new FastIO3();
		int k = br.nextInt();
		String line = br.nextLine();
		br.println(count_all_refs(line, k));
	}
}
