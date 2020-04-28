package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.util.Vector;

class FastIO6 {
	BufferedReader br;
	StringTokenizer st;	
	public FastIO6() {
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

public class Nicola {	
	private static int MAX_LIMIT=1000;
	private static int MAX_INF=100000;
	private static int[][] sqr = new int[MAX_LIMIT+1][MAX_LIMIT+1];
	private static Vector<Integer> tmp = new Vector<>();
	
	static int result(int x, int y) {		
	    if (x < 0 || x > tmp.size() - 1) return MAX_INF;  
	    int v = sqr[x][y];  
	    if (x == tmp.size()-1) return tmp.get(x) - tmp.get(0);
	    if (v == -1) {  
	        int c1 = tmp.get(x) + result(x+y+1, y+1);
	        int c2 = tmp.get(x) + ((y != 0)?result(x-y, y):MAX_INF);
	        v = Math.min(c1, c2);    
	    }
	    return v;
	}
	
	public static void main(String[] args) throws IOException {
		FastIO6 sc = new FastIO6();
		OutputStream out = System.out;
		int n = sc.nextInt(); 
		for(int i=0;i<n;i++) for(int j=0;j<=n;j++) sqr[i][j]=-1;
		for(int i=0;i<n;i++) tmp.add(sc.nextInt());    
		int smallest = result(0,0);
	    out.write((String.valueOf(smallest)+"\n").getBytes());		
	}
}
