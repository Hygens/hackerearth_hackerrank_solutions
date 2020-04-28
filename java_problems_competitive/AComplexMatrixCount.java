package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO6 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO6() {
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

public class AComplexMatrixCount {
	static int submatrices(String[][] mtx, int n, int m, int k, int x) {
		int sum =0; int acc = 0;
		for (int i = 0; i <= n - m; i++) {
			for (int j = 0; j <= n - m; j++) {
				int p, q;
				for (p = 0; p < m; p++) {
					for (q = 0; q < m; q++) {
						if (mtx[p][q].equals(String.valueOf(x))) acc+=1;						
					}					
				}
				if (acc==k) sum+=1;				
			}			
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		FastIO6 in = new FastIO6();		
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int x = in.nextInt();
		String[][] matrix = new String[n][m];
		for (int j = 0; j < n; j++) {
			matrix[j] = in.nextLine().split(" ");
		}		
		in.println(submatrices(matrix,n,m,k,x));
	}
}
