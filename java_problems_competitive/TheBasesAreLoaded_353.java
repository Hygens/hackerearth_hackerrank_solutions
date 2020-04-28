package com.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastIO2 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO2() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			
		}
		return str;
	}
}

public class TheBasesAreLoaded_353 {
	public static String baseConverter(String number, String base, String radix) throws NumberFormatException {
		return Integer.toString(Integer.parseInt(number, Integer.parseInt(base)), Integer.parseInt(radix));
	}
	
	public static void main (String args[])  // entry point from OS
	 {
		TheBasesAreLoaded_353 myWork = new TheBasesAreLoaded_353();  // create a dinamic instance
	     myWork.Begin();            // the true entry point     
	 }

	public void Begin() {
		FastIO2 sc = new FastIO2();		
		String vars = sc.nextLine().trim();	
		String[] arr = {};
		while (vars != null && !vars.isEmpty()) {
			try {
				arr = vars.trim().split("[\\s]+");
				String result = baseConverter(arr[2].trim(), arr[0].trim(), arr[1].trim());
				System.out.printf("%s base %s = %s base %s\n",arr[2].trim(),arr[0].trim(),result.toUpperCase(),arr[1].trim());				
			} catch (NumberFormatException e) {
				System.out.printf("%s is an illegal base %s number\n",arr[2].trim(),arr[0].trim());				
			} catch (Exception e) {
				break;
			}
			vars = sc.nextLine();
		}
		System.exit(0);
	}
}
