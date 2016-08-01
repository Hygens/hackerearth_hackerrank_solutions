package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
public class MancunianAndMultiplicativeQueries {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long M = 1000000007;
		String[] vars = br.readLine().split(" ");
		int n = Integer.parseInt(vars[0]);
		int c = Integer.parseInt(vars[1]);
		int q = Integer.parseInt(vars[2]);
		int[] A = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int[] FUNC = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		long p = 1;
		for (int i = 0 ;i<q; i++) {
			String[] inter = br.readLine().split(" ");
			int l = Integer.parseInt(inter[0]);
			int r = Integer.parseInt(inter[1]);
			int[] sub = Arrays.copyOfRange(A, l-1, r);
			Map<Integer, Long> freq = Arrays.stream(sub).boxed().
	                collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
			for(Integer e: freq.keySet()) {				
				int key = e.intValue();
				if (key<=c) p=((p%M)*(FUNC[freq.get(key).intValue()]%M))%M;	
			}
		}
		System.out.println(p);
	}
}
