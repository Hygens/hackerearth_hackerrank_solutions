package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.StringTokenizer;

import javafx.collections.transformation.SortedList;

import java.nio.CharBuffer;

class FastIO1 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO1() {
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

public class AkashAndAssignment {	
	public static void main(String[] args) throws IOException {
		FastIO1 sc = new FastIO1();
		OutputStream out = System.out;
		int n = sc.nextInt(); 
		int q = sc.nextInt();
		String A = sc.nextLine().trim();				
		for(int j=0;j<q;j++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			if (r-l+1<k) out.write("Out of range\n".getBytes()); 
			else {
				char[] sorted = A.substring(l-1,r).toCharArray();
				Arrays.sort(sorted);
				out.write((sorted[k-1]+"\n").getBytes());
			}
		}
	}
}
