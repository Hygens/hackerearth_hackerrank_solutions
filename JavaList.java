package com.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class JavaList {
	public static void main(String[] args) throws IOException {
		 Scanner bi= new Scanner(System.in);
		 int N = Integer.parseInt(bi.nextLine().trim());
		 List<String> L = new ArrayList<>(Arrays.asList(bi.nextLine().trim().replace("  "," ").split(" "))); 
		 int Q = Integer.parseInt(bi.nextLine().trim());
		 while (Q>0) {
			 String q = bi.nextLine().trim();
			 if (q.equals("Insert")) L.add(bi.nextInt(), bi.nextLine().trim());
			 else if (q.equals("Delete")) L.remove(Integer.parseInt(bi.nextLine()));
			 Q--;
		 }
		 System.out.println(String.join(" ", L).trim());
	}
}
