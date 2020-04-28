package com.tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ArrayLeft {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] vars = in.nextLine().split(" ");
		List<String> l = Arrays.asList(in.nextLine().split(" "));
		int left = -(Integer.parseInt(vars[1]));
		Collections.rotate(l,left);
		System.out.println(String.join(" ", l));
		in.close();
	}
}
