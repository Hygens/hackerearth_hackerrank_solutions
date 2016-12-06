package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class XorSequence {
	static long getValue(long x) {
		long a = x % 8;
		if (a == 0 || a == 1)
			return x;
		if (a == 2 || a == 3)
			return 2;
		if (a == 4 || a == 5)
			return x + 2;
		if (a == 6 || a == 7)
			return 0;
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());		
		while (q-->0) {
			long[] vals = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
			long res = getValue(vals[1])^getValue(vals[0]-1);
			System.out.println(res);
		}
	}

}