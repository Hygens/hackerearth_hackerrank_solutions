package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
class FastIO10 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;
	public FastIO10() {
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
	void print(Object o) throws IOException {
		out.write(String.valueOf(o).getBytes());
	}
	void println(Object o) throws IOException {
		out.write((String.valueOf(o) + "\n").getBytes());
	}
}

public class NormalType {
	public static void main(String[] args) throws IOException {
		FastIO10 in = new FastIO10();
		int n = in.nextInt();
	    Set<Long> bag = new HashSet<>();
	    long[] nums = new long[n];
	    for(int i = 0; i < n; i++){
	        long num = in.nextLong();
	        nums[i] = num;
	        bag.add(num);
	    }
	    long m = bag.size();
	    Map<Long, Long> counts = new HashMap<>();
	    for(Long it: bag){
	        counts.put(it, 0l);
	    }
	    long res = 0;
	    long count = 0;
	    int a=0, b=0;
	    for(a = 0; a < n; a++){
	        if(a == 0){
	            b = -1;
	        }else{
	            long num = nums[a - 1];
	            counts.put(num,counts.get(num)-1);
	            if(counts.get(num) <= 0){
	                count -= 1;
	            }
	        }
	        while(count < m && b + 1 < n){
	            b += 1;
	            long num = nums[b];
	            if(counts.get(num) <= 0){
	                count += 1;
	            }
	            counts.put(num,counts.get(num)+1);
	        }
	        if(count < m){
	            break;
	        }
	        res += (n - b);
	    }
	    in.println(res);
	}
}
