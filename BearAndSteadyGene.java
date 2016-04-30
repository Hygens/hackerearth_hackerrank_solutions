package com.tests;
import java.io.*;
import java.util.*;
public class BearAndSteadyGene {
	Scanner in;
	StringTokenizer tokenizer;
	boolean eof;	
	static final String GENS = "ACGT";
	void solve() throws IOException {
		int n = in.nextInt();
		String s = nextToken();
		int[] a = new int[n];		
		int need = n / 4;		
		int[] cnt = new int[4];
		for (int i = 0; i < n; i++) {
			a[i] = GENS.indexOf(s.charAt(i));
			cnt[a[i]]++;
		}		
		if (cnt[0] == need && cnt[1] == need && cnt[2] == need && cnt[3] == need) {
			System.out.println(0);
			return;
		}		
		int low = 0;
		int high = n;		
		outer: while (high - low > 1) {
			int mid = (low + high) >> 1;			
			int[] tmp = cnt.clone();
			for (int i = 0; i < mid; i++) {
				tmp[a[i]]--;
			}			
			if (tmp[0] <= need && tmp[1] <= need && tmp[2] <= need && tmp[3] <= need) {
				high = mid;
				continue outer;
			}			
			for (int i = mid; i < n; i++) {
				tmp[a[i - mid]]++;
				tmp[a[i]]--;
				
				if (tmp[0] <= need && tmp[1] <= need && tmp[2] <= need && tmp[3] <= need) {
					high = mid;
					continue outer;
				}
			}			
			low = mid;
		}
		System.out.println(high);		
	}
	BearAndSteadyGene() throws IOException {
		in = new Scanner(System.in);
		solve();
		System.out.close();
	}
	public static void main(String[] args) throws IOException {
		new BearAndSteadyGene();
	}
	String nextToken() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(in.nextLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return tokenizer.nextToken();
	}	
}