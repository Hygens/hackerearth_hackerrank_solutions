package com.tests;
import java.util.*;

public class BeautifulQuadruplets {
	  public static void main(String args[]) {  
	      Scanner lines = new Scanner(System.in);
	      String[] data=lines.nextLine().split(" ");
	      int a = Integer.parseInt(data[0]);
	      int b = Integer.parseInt(data[1]);
	      int c = Integer.parseInt(data[2]);
	      int d = Integer.parseInt(data[3]);
	      Set<Vector<Integer>> old = new HashSet<>();
	      Vector<Integer> elems = null;
	      for (int w=1;w<=a;w++) {    	  
	    	  for (int x=1;x<=b;x++) {    		 
	    		 for (int y=1;y<=c;y++) {
	    			 for (int z=1;z<=d;z++) { 
				         if ((((w^x)^y)^z)!=0) {
				        	 elems = new Vector<>();
				        	 elems.add(w); elems.add(x); elems.add(y);  elems.add(z);
				        	 Collections.sort(elems);			        	 
				             old.add(elems);			           
				         }
				     }
				  }
	    	  }			    	   
	      }
	      System.out.println(old.size());                
	  }
}
