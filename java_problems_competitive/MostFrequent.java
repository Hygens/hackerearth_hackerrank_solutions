package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.StringTokenizer;
class FastIO17 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;

	public FastIO17() {
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

public class MostFrequent {
	public static void main(String[] args) throws IOException {
		FastIO17 sc = new FastIO17();		
		int N = sc.nextInt(); 
		long[] pos = new long[N]; long[] neg = new long[N];
		for(int i=0;i<N;i++) { pos[i]=neg[i]=0; }		
		for(int i=0;i<N;i++) {
	    	int temp = sc.nextInt();
	    	if(temp>=0)
	    	{
	    		pos[temp]++;
	    	}
	    	else
	    	{
	    		temp=temp*-1;
	    		neg[temp]++;
	    	}
	    }
	    int pmax=0,nmax=0;
	    
	}
}
