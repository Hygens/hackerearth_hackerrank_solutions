package com.challenges;
import java.util.Scanner;
public class Odditties {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0) {
        	int i = in.nextInt();
            if (0 == Math.abs(i) % 2) System.out.println(i+" is even");
            else  System.out.println(i+" is odd");
        }
    }
}