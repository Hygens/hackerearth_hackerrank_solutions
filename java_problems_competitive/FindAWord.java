package com.tests;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindAWord {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int no = sc.nextInt();
	        String line="";
	        while(no-- >=0)
	            line+=" "+sc.nextLine();
	        int testCases=sc.nextInt();
	        while(testCases-->=0)
	        {
	            String word = sc.nextLine();
	            int count=0;
	            if(!word.equals(""))
	            {
	                String pattern ="(?<![a-zA-Z0-9_]){1,}"+word+"(?![a-zA-Z0-9_]){1,}";
	                Pattern wordPattern = Pattern.compile(pattern);
	                Matcher m = wordPattern.matcher(line);
	                while(m.find())
	                    count++;                
	                System.out.println(count);
	            }
	        }
	 }

}
