package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.StringTokenizer;

class FastIO14 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO14() {
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

public class XorSubsequences_Fast {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FastIO14 br = new FastIO14();
		OutputStream out = System.out;	    
	    int n = br.nextInt();
	    int[] xor = new int[n+2];
	    int[] counts = new int[1<<16];
	    long first=0, last=0, next=0;
	    for (int i = 1; i < n+1; i++){
	      next = br.nextLong();
	      xor[i] = (int)(next ^ (long)xor[i-1]);
	      counts[xor[i]]++;	      
	      if (i==1) first = next;
	      if (i==n) last  = next;
	    }	  
	    int x = (int)(last ^ first); counts[x]++;
	    int[] results = new int[1<<16]; Arrays.fill(results, 1);
	    for (int i = 0; i < counts.length; i++) {
	      for (int j = i+1; j < counts.length; j++) {
	        results[i^j] += counts[i] * counts[j];
	      }
	    }
	    int max = 0;
	    int idx = -1;
	    for (int i = 0; i < results.length; i++) {
	      if (results[i] > max) {
	        max = results[i];
	        idx = i;
	      }
	    }
	    out.write((idx + " " + max).getBytes());
	}

}