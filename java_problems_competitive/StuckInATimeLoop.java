package com.challenges;
import java.util.Scanner;
import java.util.stream.IntStream;
public class StuckInATimeLoop {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        IntStream.range(1, n+1).forEach(x -> System.out.println(x+" Abracadabra"));            
    }
}