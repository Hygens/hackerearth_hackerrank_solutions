package com.tests;

import java.util.Scanner;
import java.util.BitSet;
public class JavaBitSet {
	public static void main(String[] args) {
		 Scanner bi= new Scanner(System.in);
		 BitSet[] bitsets = {new BitSet(),new BitSet()};
		 String[] arg = bi.nextLine().replace("  "," ").trim().split(" ");
		 int n = Integer.parseInt(arg[0]); int m = Integer.parseInt(arg[1]);
		 while (m>0) {
			 String[] q = bi.nextLine().replace("  "," ").trim().split(" ");
			 if (q[0].equals("AND")) 
				 bitsets[Integer.parseInt(q[1])-1].and(bitsets[Integer.parseInt(q[2])-1]);
			 else if (q[0].equals("OR")) 
			 	 bitsets[Integer.parseInt(q[1])-1].or(bitsets[Integer.parseInt(q[2])-1]);
			 else if (q[0].equals("XOR")) 
				 bitsets[Integer.parseInt(q[1])-1].xor(bitsets[Integer.parseInt(q[2])-1]);
			 else if (q[0].equals("FLIP")) 
				 bitsets[Integer.parseInt(q[1])-1].flip(Integer.parseInt(q[2]));
			 else if (q[0].equals("SET")) 
				 bitsets[Integer.parseInt(q[1])-1].set(Integer.parseInt(q[2]));
			 System.out.println(bitsets[0].cardinality()+" "+bitsets[1].cardinality());
			 m--;
		 }
		 
	}
}
