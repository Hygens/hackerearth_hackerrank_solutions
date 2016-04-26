package com.tests;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASubstring {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int N=Input.nextInt();
		Input.nextLine();
		String Test_String = null;
		int count=0;
        for(int i=0;i<N;i++) {
        	Test_String=Input.nextLine();
        	int T=Integer.parseInt(Input.nextLine());
        	for(int j=0;j<T;j++) { 
        		String s = Input.nextLine();
        		String Regex_Pattern="([a-zA-Z0-9_]("+s+")[a-zA-Z0-9_])";
        		Pattern p = Pattern.compile(Regex_Pattern);
        		Matcher m = p.matcher(Test_String); 
        		while (m.find()) count++;        			
        		System.out.println(count);
        		m=null;
        		p=null;
        		count=0;
        	}
        }
	}

}
