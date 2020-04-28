package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class FastIO13 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO13() {
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

public class GameOfSurvival {
	public static void main(String[] args) throws IOException {
		FastIO13 sc = new FastIO13();		
		int T = sc.nextInt();
		int N,i;		
		while(T-->0)
		{
			N = sc.nextInt();
			Long[] A = new Long[N]; Long[] S = new Long[N];
			for(i=0;i<N;i++) { A[i] = sc.nextLong(); }
			for(i=0;i<N;i++) { S[i] = sc.nextLong(); }
			Arrays.sort(A,Collections.reverseOrder()); 
			Arrays.sort(S,Collections.reverseOrder()); 
			for(i=0;i<N;i++)
			{
				if(A[i]<=S[i])
					break;
			}
			if(i==N)
				sc.println("YES");
			else
				sc.println("NO");
				
		}
	}
}
