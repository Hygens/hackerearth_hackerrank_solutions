package com.tests;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindMedian {
	private static void printMedian(int[] arr){
        StringBuilder sb = new StringBuilder();
        double median;
        int lenMaxHeap, lenMinHeap, value;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        final DecimalFormat numberFormat = new DecimalFormat("#.0");
        final String NEW_LINE = System.getProperty("line.separator");
        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            lenMaxHeap = maxHeap.size();
            lenMinHeap = minHeap.size();            
            if (lenMaxHeap == 0 && lenMinHeap == 0) {
                maxHeap.add(value);
                median = value;
            }            
            else {
                if (lenMaxHeap == lenMinHeap) {
                    if (value <= maxHeap.peek()) {
                        maxHeap.add(value);
                        median = maxHeap.peek();
                    } else {
                        minHeap.add(value);
                        median = minHeap.peek();
                    }
                } else {
                    if (lenMinHeap > lenMaxHeap) {
                        if (value > minHeap.peek()) {
                            maxHeap.add(minHeap.poll());
                            minHeap.add(value);
                        } else {
                            maxHeap.add(value);
                        }
                    } else if (lenMinHeap < lenMaxHeap) {
                        if (value < maxHeap.peek()) {
                            minHeap.add(maxHeap.poll());
                            maxHeap.add(value);
                        } else {
                            minHeap.add(value);
                        }
                    }
                    median = (maxHeap.peek() + minHeap.peek()) * 0.5;
                }
            }
            sb.append(numberFormat.format(median).replace(",", "."));
            sb.append(NEW_LINE);
        }
        System.out.println(sb.toString());
    }

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int N=Integer.parseInt(Input.nextLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(Input.nextLine());			
		}
		printMedian(arr);		
	}

}
