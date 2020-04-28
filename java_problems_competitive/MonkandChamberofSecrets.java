package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class FastIO14 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO14() {
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

	Long nextLong() {
		return Long.valueOf(next());
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

class Spider {
	public int power;
	public int pos;

	public Spider(int power, int pos) {
		this.power = power;
		this.pos = pos;
	}
}

public class MonkandChamberofSecrets {
	public static void main(String[] args) throws IOException {
		FastIO14 sc = new FastIO14();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Queue<Spider> spiders = new ArrayDeque<>();
		for (int i = 0; i < n; i++)
			spiders.add(new Spider(sc.nextInt(), i + 1));
		for (int i = 0; i < m; i++) {
			Spider best = spiders.peek();
			Queue<Spider> removedSpiders = new ArrayDeque<>();
			for (int j = 0; j < m; j++) {
				if (spiders.isEmpty()) {
					break;
				}
				Spider spider = spiders.poll();
				if (spider.power > best.power) {
					best = spider;
				}
				removedSpiders.add(spider);
			}
			sc.print(String.valueOf(best.pos) + " ");
			boolean found = false;
			while (!removedSpiders.isEmpty()) {
				Spider spider = removedSpiders.poll();
				if (!found) {
					if (spider.power == best.power) {
						found = true;
						continue;
					}
				}
				if (spider.power - 1 > 0)
					spider.power = spider.power - 1;
				else
					spider.power = 0;
				spiders.add(spider);
			}
		}
	}
}
