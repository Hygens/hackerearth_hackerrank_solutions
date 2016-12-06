package com.challenges;
import java.util.Scanner;
public class TakeTwoStones {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2!=0) System.out.println("Alice");
        else System.out.println("Bob");              
    }
}