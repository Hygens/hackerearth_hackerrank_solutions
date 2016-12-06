package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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

public class IthQueens {
	private static int SIZE = 20000;
	public static void main(String[] args) throws IOException {
		FastIO4 sc = new FastIO4();
		OutputStream out = System.out;
		int X, Y, n, x, y, res; 
		X = sc.nextInt(); Y = sc.nextInt(); n = sc.nextInt();
		while (X+Y+n!=0) {
			res = 0;
			int rows[] = new int[SIZE];
			int cols[] = new int[SIZE];
			int diag1[]= new int[2*SIZE+1];
			int diag2[]= new int[2*SIZE+1];
			while(n-->0){
	            x = sc.nextInt(); y= sc.nextInt();
	            x--; y--;
	            rows[x]++; cols[y]++; diag1[x+y]++; diag2[Y+x-y]++;
	        }
			for(x=0;x<X;x++)
	            for(y=0;y<Y;y++){
	                if(rows[x]<=0 && cols[y]<=0 && diag1[x+y]<=0 && diag2[Y+x-y]<=0){
	                    res++;
	                }
	            }
	        out.write((String.valueOf(res)+"\n").getBytes());
			X = sc.nextInt(); Y = sc.nextInt(); n = sc.nextInt();
		}
	}
}

