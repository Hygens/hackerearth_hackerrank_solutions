package com.tests;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class QHeap1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int Q = Integer.parseInt(sc.nextLine().trim());
		for (int i = 0; i < Q; i++) {
			String[] q = sc.nextLine().split(" ");
			if (q[0].equals("2")) pq.remove(Integer.parseInt(q[1]));
			else if (q[0].equals("3")) System.out.println(pq.element());
			else pq.add(Integer.parseInt(q[1]));
		}
	}
}
