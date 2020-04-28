package com.tests;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class MaxMin {
	public static <T> Stream<List<T>> sliding(List<T> list, int size) {
	    if(size > list.size()) 
	        return Stream.empty();
	    return IntStream.range(0, list.size()-size+1)
	                    .mapToObj(start -> list.subList(start, start+size));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine().trim());
		int k = Integer.parseInt(sc.nextLine().trim());
		Integer[] arr = new Integer[n];		
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(sc.nextLine().trim());			
		}
		Arrays.sort(arr);
		List<Integer> list = Arrays.asList(arr);
		Comparator<Integer> cmp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		};
		System.out.println(sliding(list,k).map(x -> x.get(k-1)-x.get(0)).min(cmp).get());
	}
}
