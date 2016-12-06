package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.StringTokenizer;
class FastIO4 {
	BufferedReader br;
	StringTokenizer st;
	public FastIO4() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine()," ", true);
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

public class SortedSubSegments {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		FastIO4 bi = new FastIO4();
		int n = bi.nextInt(); int q = bi.nextInt(); int k = bi.nextInt();
		int[] arr = new int[n];
		int x = 0;
		while(n-->0) arr[x++]=bi.nextInt();
		while (q-->0) {
			int l = bi.nextInt(); int r = bi.nextInt();
			Arrays.sort(arr, l, r+1);			
		}
		out.write((String.valueOf(arr[k])+"\n").getBytes());
	}
}
