package com.uva;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO1 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO1() {
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

public class BasicallySpeaking_389 {
	public static String baseConverter(String number, String base, String radix) {
		return Integer.toString(Integer.parseInt(number, Integer.parseInt(base)), Integer.parseInt(radix));
	}
	
	public static void main (String args[])  // entry point from OS
	 {
		BasicallySpeaking_389 myWork = new BasicallySpeaking_389();  // create a dinamic instance
	     myWork.Begin();            // the true entry point     
	 }

	public void Begin() {
		FastIO1 sc = new FastIO1();		
		String vars = sc.nextLine().trim();
		while (vars != null && !vars.isEmpty()) {
			try {
				String[] arr = vars.trim().split("[\\s]+");
				String result = baseConverter(arr[0].trim(), arr[1].trim(), arr[2]);
				if (result.length() > 7)
					System.out.printf("%7s\n","ERROR");
				else
					System.out.printf("%7s\n",result.toUpperCase());
				vars = sc.nextLine();
			} catch (Exception e) {
				break;
			} 
		}
		System.exit(0);
	}
}
