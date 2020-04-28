package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO1 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO1() {
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

public class Dvds {	
	public static double log2(int n)
	{
	    return (Math.log(n) / Math.log(2));
	}
	public static void main(String[] args) throws IOException {
		FastIO1 sc = new FastIO1();
		OutputStream out = System.out;
		int t = sc.nextInt(); 
		int[] tmp = new int[1000002];
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			for(int j=1;j<=n;j++){
	            tmp[j]=sc.nextInt();
	        }
			int cr = 1;
			int r = 0;
			for(int k=1;k<=n;k++){
	            if(tmp[k]!=cr){
	                r++;
	            }
	            else{
	                cr++;
	            }
	        }
	        out.write((String.valueOf(r)+"\n").getBytes());			
		}
	}
}
