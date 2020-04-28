package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.*;
class FastIO8 {
	BufferedReader br;
	StringTokenizer st;
	public FastIO8() {
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

class FTree {
	private int LIMIT = 50010;
	private long tree[] = new long[LIMIT];
	private int MOD = 1000000007;
	public	FTree() { }
	long get(int idx) { return query(idx) - query(idx - 1); }
	void set(int idx, long val)	{ long curr = get(idx); update(idx, val - curr); }
	void update(int idx, long val) {
		while (idx <= LIMIT)
		{
			tree[idx] = (tree[idx] + val) % MOD;
			idx += (idx & -idx);
		}
	}
	long query(int idx)	{
		long sum = 0;
		while (idx > 0)
		{
			sum = (sum + tree[idx]) % MOD;
			idx -= (idx & -idx);
		}
		return sum;
	}
}

public class CandiesCounting {
	private static int MAXI = 50000;
	private static int LIMIT = 50010;
	private static int MOD = 1000000007;
    public static void main(String[] args) throws IOException {
		FastIO8 input = new FastIO8();
		OutputStream out = System.out;
		FTree ftree[] = new FTree[128]; 
		ftree[0]=new FTree();
		ftree[0].update(1, 1);
		int n = input.nextInt(); int k = input.nextInt();
		int H[] = new int[MAXI]; int C[] = new int[MAXI];
		for (int i = 0; i < n; i++) {
			H[i] = input.nextInt(); H[i]++;
			C[i] = input.nextInt(); C[i]--;
			for (int l = 0; l < (1 << k); l++)
			{
				ftree[l] = new FTree();
				long v = ftree[l].query(H[i] - 1);
				int idx = l | (1 << C[i]);
				if (ftree[idx]==null) ftree[idx]= new FTree();
				ftree[idx].update(H[i], v);
			}		
		}
		out.write(String.valueOf(ftree[(1 << k) - 1].query(50001)).getBytes());
	}
}