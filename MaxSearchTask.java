package com.tests;

import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
public class MaxSearchTask extends RecursiveTask<Integer> {
    private int[] numbers;
    private int startIndex;
    private int endIndex;
    private int taskSize = 50_000;

    public MaxSearchTask(int[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public MaxSearchTask(int[] numbers, int startIndex, int endIndex) {
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    protected Integer compute() {
        if ((endIndex - startIndex) <= taskSize) {             
              //We reached a problem of size below which we do not intend to divide            
              return findMax(startIndex, endIndex);         
        } else {             
             int mid = startIndex + (endIndex - startIndex) / 2 ;                         
             MaxSearchTask leftTask = new MaxSearchTask(numbers, startIndex, mid);             
             MaxSearchTask rightTask = new MaxSearchTask(numbers, mid, endIndex);             
             //asynchronously execute both left and right tasks in the pool the current task is running in             
             leftTask.fork();             
             rightTask.fork();             
             //wait for the left half result             
             int leftResult = (int) leftTask.join();             
             //wait for the right half result             
             int rightResult = (int) rightTask.join();             
             return leftResult > rightResult ? leftResult : rightResult;
        }
    }

    /**
     * Called to find the maximum integer that can be found in the range.
     *
     * @param start start index (inclusive)
     * @param end   end   index (exclusive)
     * @return max integer in range
     */
    private int findMax(int start, int end) {
        int max = numbers[start];
        //i starts with next index
        for(int i = start + 1; i < end; i++) {             
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
