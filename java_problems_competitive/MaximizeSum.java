package com.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MaximizeSum {
	static int N=0,M=0,s=0,r=0;
	public static <T> List<List<T>> generateAllSubsets(List<T> original) {
	    List<List<T>> allSubsets = new ArrayList<List<T>>();
	    allSubsets.add(new ArrayList<T>()); //Add empty set.
	    List<T> extended=null;
	    for (T element : original) {
	        // Copy subsets so we can iterate over them without ConcurrentModificationException
	        List<List<T>> tempClone = new ArrayList<List<T>>(allSubsets);
	        // All element to all subsets of the current power set.
	        for (List<T> subset : tempClone) {
	            extended = new ArrayList<T>(subset);
	            extended.add(element);
	            allSubsets.add(extended);
	        }
	        if (s==0) s=extended.stream().mapToInt(x -> ((Integer) x).intValue()).sum()%M;
			else {
				r=extended.stream().mapToInt(x -> ((Integer) x).intValue()).sum()%M;
				if (r>s) s=r;
			}
	    }
	    return allSubsets;
	}
	
	public static void main(String[] args)  {
		Scanner in=new Scanner(System.in);
		int T=Integer.parseInt(in.nextLine());
		String[] nm=in.nextLine().split(" ");
		N=Integer.parseInt(nm[0]);
		M=Integer.parseInt(nm[1]);
		List<Integer> list=new ArrayList<Integer>();
		for(String n: in.nextLine().split(" ")) list.add(Integer.parseInt(n));
		in.close();
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}					
		});
		List<List<Integer>> ints = generateAllSubsets(list);
		System.out.println(s);		
	}

}
