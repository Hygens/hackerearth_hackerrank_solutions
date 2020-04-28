package com.tests;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

class FastIO10 {
	BufferedReader br;
	StringTokenizer st;
	public FastIO10() {
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

public class QueriesWithFixedLength {
	static int computeMin(List<Integer> arr, int n, int d) throws Exception {
		Deque<Integer> tmp = new ArrayDeque<>(arr.subList(0, d));
		Deque<Integer> res = new ArrayDeque<>();
		res.push(Collections.max(tmp));
		for (int i = d; i < n; i++) {
			tmp.removeFirst(); tmp.addLast(arr.get(i));
			res.add(Collections.max(tmp));
		}		
		return Collections.min(res);
	}
	public static void main(String[] args) throws Exception {
		FastIO10 input = new FastIO10();
		OutputStream out = System.out;
		int n = input.nextInt();
		int q = input.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++)	arr.add(input.nextInt());
		for (int i = 0; i < q; i++) {
			int d = Integer.parseInt(input.nextLine());
			if (d == 1) {
				out.write((String.valueOf(Collections.min(arr)) + "\n").getBytes());
			} else {
				out.write((String.valueOf(computeMin(arr, n, d)) +"\n").getBytes());
			}
		}
	}
}