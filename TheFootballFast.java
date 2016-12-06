package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Stack;
import java.util.StringTokenizer;

class FastIO2 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO2() {
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

public class TheFootballFast {	
	public static void main(String[] args) throws IOException {
		FastIO2 sc = new FastIO2();
		OutputStream out = System.out;
		int t = sc.nextInt(); 
		int q = sc.nextInt(); 
		String id = sc.nextLine().trim();
		Stack<String> st = new Stack<>();	
		st.push(id);
		Stack<String> steps = new Stack<>();
		while(t-->0) {
			String j = "";
			for(int i=0;i<q;i++) {
				String Q = sc.nextLine().trim();
				if (Q.length()>1) {
					st.push(Q.split(" ")[1]); 
					steps.add("P");
				}
				else {
					if (st.size()>0 && !steps.peek().equals("B")) { 
		                j = st.pop();
		                steps.push("B");
					}
					else if (st.size()>0 && steps.peek().equals("B"))
		                st.push(j);
		                j = st.get(st.size()-2);               
		                steps.push("B");
				}			
			}
			out.write(("Player "+ st.peek()+"\n").getBytes());
		}
	}
}
