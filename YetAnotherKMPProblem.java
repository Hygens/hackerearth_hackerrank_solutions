package com.tests;
import java.util.*;
public class YetAnotherKMPProblem {
	static int[] calcKMP(int[] s) {
		int[] kmp = new int[s.length+1];
		int l = 0;
		kmp[1] = 0;
		for (int i = 2; i <= s.length; i = i + 1) {
			l = kmp[i - 1];
			while (l > 0 && s[i-1] != s[l + 1]) {
				l = kmp[l];
			}
			if (s[i-1] == s[l + 1]) {
				kmp[i] = l + 1;
			} else {
				kmp[i] = 0;
			}
		}
		return kmp;
	}
	public static void main(String[] args) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		Scanner sc=new Scanner(System.in);
		int[] s=Arrays.asList(sc.nextLine().split(" ")).stream()
				 .mapToInt(Integer::parseInt).toArray();
		int[] kmp = calcKMP(s);
		String res="";
		int sum=0;
		for(int i=0;i<s.length;i++) {
			if (s[i]!=0) {
				sum+=kmp[i+1]; 
				res+=String.join("", Collections.nCopies(s[i], String.valueOf(letters.toCharArray()[i])));
			}
		}
		Comparator<String> cmp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}			
		};
		String[] ch = res.split(""); Arrays.sort(ch,cmp);
		res=String.join("",ch);
		System.out.println(res);		
	}
}
