package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.*;
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
public class MergingCommunities {
	static int root(int a[], int i) {
		while (a[i] != i) {
			i = a[i];
		}
		return i;
	}
	static void union(int a[],int size[],int r,int s)
	{
	    int root_r=root(a,r);
	    int root_s=root(a,s);

	    if(root_r!=root_s)
	    {
	        if(size[root_r] < size[root_s]){
	            a[root_r]=a[root_s];
	            size[root_s]+=size[root_r];
	        }
	        else {
	            a[root_s]=a[root_r];
	            size[root_r]+=size[root_s];

	        }
	    }
	}
    public static void main(String[] args) throws IOException {
		FastIO6 input = new FastIO6();
		OutputStream out = System.out;
		int size[] = new int[100005];
		int a[] = new int[100005];
		int n = input.nextInt(); int q = input.nextInt();
		for (int i = 1; i <= n; i++) {
			a[i] = i;
			size[i] = 1;
		}
		for (int i = 1; i <= q; i++) {
			String c = input.next(); 
			if (c.equals("Q")) {
				int p = input.nextInt();				
				out.write((String.valueOf(size[root(a,p)])+"\n").getBytes());
			} else if (c.equals("M")) {
				int r = input.nextInt(); int s = input.nextInt();
				union(a, size, r, s);
			}			
		}
	}
}