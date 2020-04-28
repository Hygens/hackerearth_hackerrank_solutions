package com.challenges;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class UnbearableZoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        Map<String,Integer> m = new TreeMap<>();
        int nl=1;
        int n = Integer.parseInt(in.nextLine());
        while(n!=0) {
        	System.out.println("List "+nl+":");   
            while(n-->0) {
              String[] animals = in.nextLine().split(" "); 
              String animal = animals[animals.length-1].toLowerCase();
              if (!m.containsKey(animal)) m.put(animal,1);
              else {
            	  int count =  m.get(animal) + 1;
            	  m.put( animal, count );              
              }
            }
            for (String k: m.keySet()) System.out.println(k + " | " + m.get(k));
            nl++;
            m.clear();
            n = Integer.parseInt(in.nextLine());
        }
    }
}