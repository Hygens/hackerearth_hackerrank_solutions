package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class FastIO {
	BufferedReader br;
	StringTokenizer st;

	public FastIO() {
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
class Station {
	int gas;
	int next;
}
public class TruckTour {
	
	public static void main(String[] args) throws IOException {
		FastIO sc = new FastIO();
		OutputStream out = System.out;
		Queue<Station> paths = new LinkedList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Station st = new Station();
			st.gas = sc.nextInt();
			st.next = sc.nextInt();
			paths.add(st);
		}
		int start = 0, passed = 0, gas = 0;
		while (passed < n) {
			Station st = paths.peek();
			gas += st.gas;
			paths.poll();
			if (gas >= st.next) {
				passed += 1;
				gas -= st.next;
			} else {
				start += passed + 1;
				passed = 0;
				gas = 0;
			}
			paths.add(st);
		}
		out.write((String.valueOf(start) + "\n").getBytes());
	}
}
