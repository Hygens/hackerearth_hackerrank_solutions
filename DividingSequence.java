package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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

public class DividingSequence {	
	public static double log2(int n)
	{
	    return (Math.log(n) / Math.log(2));
	}
	public static void main(String[] args) throws IOException {
		FastIO sc = new FastIO();
		OutputStream out = System.out;
		int n = sc.nextInt(); 
		int res = (int)log2(n) + 1;
	    out.write((String.valueOf(res)+"\n").getBytes());
	    for(int i=0;i<res;i++){
	        if(i<res-1){
	            out.write((String.valueOf((int)Math.pow(2,i))+" ").getBytes());
	        }
	        else{
	        	out.write((String.valueOf((int)Math.pow(2,i))+"\n").getBytes());
	        }
	    }
	}
}
