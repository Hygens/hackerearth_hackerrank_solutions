package com.tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTripplets {
	public static void main(String[] args) throws IOException {
		 Scanner bi= new Scanner(System.in);
		 String[] entry =bi.nextLine().split(" "); 
		 int n= Integer.parseInt(entry[0]); int d = Integer.parseInt(entry[1]);
		 int[] a=Arrays.asList(bi.nextLine().split(" ")).stream()
				 .mapToInt(Integer::parseInt).sorted().toArray();
		 int count=0;
		 for (int i = 0;i < n; i++) {
			 for (int j=i+1;j<n;j++) {
			      if(a[j]-a[i]==d) {  
			        for (int k=j+1;k<n;k++) {
			           if(a[k]-a[j]==d) count+=1;
			        }
			      } 
			  }			 
		 }
		 System.out.println(count);
	}

}
