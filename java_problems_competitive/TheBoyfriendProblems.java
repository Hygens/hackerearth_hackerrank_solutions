package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class TheBoyfriendProblems {
	static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
						
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			Stream<Integer> towers = Arrays.stream(br.readLine().split(" "))
					.map(Integer::valueOf)
					.sorted(new Comparator<Integer>() {
						@Override
			             public int compare(Integer o1, Integer o2) {		        	 
				            return o2.compareTo(o1);		            
				        }});			 
			print(Arrays.toString(towers.toArray())
					.replace(",","")
					.replace("[", "")
					.replace("]", ""));
		}	
	}	
}
