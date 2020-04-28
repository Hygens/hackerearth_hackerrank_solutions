package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO5 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO5() {
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

public class Parking {
	private static int SIZE = 20000;
	public static void main(String[] args) throws IOException {
		FastIO5 sc = new FastIO5();
		OutputStream out = System.out;
		int[][] points = new int[3][2];
		int[] prices = new int[4];
		prices[1] = sc.nextInt(); prices[2] = sc.nextInt()*2; prices[3] = sc.nextInt()*3;
		for(int i=0;i<3;i++){
	        points[i][0]=sc.nextInt(); points[i][1]=sc.nextInt();
	    }
	    int res = 0;
	    for(int i=1;i<=100;i++){
	        int overlaps = 0;
	        for(int j=0;j<3;j++){
	            if(points[j][0] <= i && points[j][1] > i){
	                overlaps++;
	            }
	        }
	        res+=prices[overlaps];
	    }
	    out.write((String.valueOf(res)+"\n").getBytes());
	}
}

