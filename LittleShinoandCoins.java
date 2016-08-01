package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LittleShinoandCoins {
	static int count_all_refs(String input_string,int k){
	    int length = input_string.length();	    
	    int s=0; int i=0;
	    while (i<length-k){
	        int j=i+k-1;
	        while (j<length){
	            if (input_string.substring(i,j+1)
	            	.chars()
	            	.distinct()
	            	.count()==k) s++; 
	            j++;
	        }
	        i++;
	    }
	    return s;
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		String line = br.readLine();
		System.out.println(count_all_refs(line,k));
	}
}
