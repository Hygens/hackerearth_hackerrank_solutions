package com.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class DemandingMoney {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String[] data = in.nextLine().trim().split(" ");
		int n = Integer.parseInt(data[0]);
		int m = Integer.parseInt(data[1]);
		Map<Integer, List<Integer>> heap = new HashMap<>();
		List<String> money = new ArrayList<String>(Arrays.asList(in.nextLine().trim().split(" ")));
		List<Integer> items = null;
		for (int i = 0; i < m; i++) {
			String[] roads = in.nextLine().trim().split(" ");
			int a = Integer.parseInt(roads[0]);
			int b = Integer.parseInt(roads[1]);
			if (money.size() > 0) {
				if (heap.size() == 0) {
					items = new ArrayList<>();
					items.add(Integer.parseInt(money.get(b - 1)));
					items.add(Integer.parseInt(money.get(a - 1)));
					heap.put(b, items);
				} else if (heap.containsKey(b)) {
					heap.get(b).add(Integer.parseInt(money.get(a - 1)));
				} else {
					items = new ArrayList<>();
					items.add(Integer.parseInt(money.get(b - 1)));
					items.add(Integer.parseInt(money.get(a - 1)));
					heap.put(b, items);
				}
			}
		}
		in.close();
		List<Integer> sums = new ArrayList<>();
		int middle = 0;
		if (heap.size() % 2 == 0)
			middle = heap.size() / 2;
		else
			middle = heap.size() / 2 + 1;
		int sum = 0;
		for (Integer i : heap.keySet()) {
			if (heap.get(i) != null) {
				if (heap.get(i).size() == 1) {
					sums.add(heap.get(i).get(0));
				} else if (heap.get(i).size() == 2) {					
					sums.add(Collections.max(heap.get(i)));
				} else if (heap.get(i).size() > 2) {
					sums.add(heap.get(i).get(1) + heap.get(i).get(2));
					if (i >= middle && heap.get(i) != null)
						sum += heap.get(i).get(1) + heap.get(i).get(2);
				}
			}
		}
		sums.add(sum);
		if (sums.size() > 1) {
			Collections.sort(sums, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2) * (-1);
				}
			});
		}
		
		if (sums.size() > 0) {
			System.out.println(sums.toString());
			System.out.println(sums.get(0) + " " + (sums.size()));
		} else
			System.out.println(0 + " " + 0);
	}
}
