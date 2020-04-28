package com.challenges;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
public class Bijele {
	public static void main(String[] args) {
    	int[] pieces = {1,1,2,2,2,8};    	
        Scanner in = new Scanner(System.in);
        int[] vals = Stream.of(in.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0;i<6;i++) vals[i]=pieces[i]-vals[i];
        System.out.println(Arrays.toString(vals)
        		.replace(",","")
        		.replace("[","")
        		.replace("]",""));       
    }
}