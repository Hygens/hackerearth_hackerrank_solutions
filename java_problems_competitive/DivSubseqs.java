package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

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

public class DivSubseqs {	
	public static void main(String[] args) throws IOException {
		FastIO3 sc = new FastIO3();
		OutputStream out = System.out;
		int c,d,n,elem,aux; 
		int[] D = new int[1000001];
		c = sc.nextInt(); 
		while (c-->0) {
			aux=0;
			D[0]++;
			int res = 0;
			d = sc.nextInt(); n = sc.nextInt();
	        for(int i=0;i<n;i++){
	            elem = sc.nextInt();
	            aux += elem;
	            D[aux % d]++;
	        }
	        for(int j=0;j<d;j++){
	            res+=D[j]*(D[j]-1)/2;
	        }
	        out.write((String.valueOf(res)+"\n").getBytes());
		}
	}
}

