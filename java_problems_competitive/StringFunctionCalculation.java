package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.*;
class FastIO3 {
	BufferedReader br;
	StringTokenizer st;
	public FastIO3() {
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

public class StringFunctionCalculation {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		FastIO3 bi = new FastIO3();
		String s = bi.nextLine();
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				int counter = 0;
				String st = s.substring(i, j);
				if (s.indexOf(st) == i) {
					for (int k = i; k < s.length(); k++) {
						String temp = s.substring(k);
						if (temp.indexOf(st) == -1)
							break;
						else if (temp.indexOf(st) == 0) {
							counter++;
						}
					}
					if (max < st.length() * counter)
						max = st.length() * counter;
				}
			}
		}
		out.write((String.valueOf(max)+"\n").getBytes());
	}
}
