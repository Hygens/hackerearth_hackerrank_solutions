package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class FastIO13 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO13() {
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

public class XorSubsequences {
	static long minKey(Map<Long, AtomicInteger> map, AtomicInteger value) {		
		List<Long> vals = new ArrayList<>();
		for (Entry<Long, AtomicInteger> entry : map.entrySet()) {
			if (entry.getValue().get()==value.get())
				vals.add(entry.getKey());
		}
		return vals.get(0).intValue();		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		FastIO13 br = new FastIO13();
		OutputStream out = System.out;
		int n = br.nextInt();
		List<Long> vals = new ArrayList<>();
		for (int x = 0; x < n; x++) vals.add(br.nextLong());
		Map<Long, AtomicInteger> dict = new ConcurrentHashMap<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 1) {
					dict.computeIfAbsent(vals.get(j), 
							x -> new AtomicInteger(0)).incrementAndGet();
				} else if (j+i <= n) {
					dict.computeIfAbsent(vals.subList(j, j + i).stream().reduce(0L, (a, b) -> a ^ b),
							x -> new AtomicInteger(0)).incrementAndGet();
				}
			}
		}
		List<AtomicInteger> values = new ArrayList<>(dict.values());		
		AtomicInteger value = Collections.max(values,new Comparator<AtomicInteger>() {
			public int compare(AtomicInteger o1, AtomicInteger o2) {
				return o1.get() - o2.get();
			}
		});
		long key = minKey(dict,value);		
		out.write((key + " " + value.get()).getBytes());		
	}
}