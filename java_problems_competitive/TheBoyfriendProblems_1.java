package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class TheBoyfriendProblems_1 {
	static void print(String s) {
		System.out.print(s);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
						
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			Queue<Integer> towers = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf)
			.collect(Collectors.toCollection(() -> new PriorityQueue<Integer>(Collections.reverseOrder())));
			while (!towers.isEmpty()) 
				if (towers.size()==n)
					print(String.valueOf(towers.poll()));
				else 
					print(" "+String.valueOf(towers.poll()));
			print("\n");
			
		}	
	}	
}
