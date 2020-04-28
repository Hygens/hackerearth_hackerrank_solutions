package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartingWithTwinder {
	static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine().trim());
		int n = Integer.parseInt(br.readLine().trim());
		
		while(n-->0) {
			String[] hl = br.readLine().trim().split(" ");
			int h = Integer.parseInt(hl[0]);
			int l = Integer.parseInt(hl[1]);
			if (h==l && h>=m) print("ACCEPTED");
			else if (h>=m && l>=m) print("CROP IT");
			else print("UPLOAD ANOTHER");
		}	
	}	
}
