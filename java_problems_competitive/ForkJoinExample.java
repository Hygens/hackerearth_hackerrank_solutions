package com.tests;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;

public class ForkJoinExample {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static int[] generateNumbers(int size) {
        int[] numbers = new int[size];
        for(int i=0; i < size ; i++) {
            numbers[i] = RANDOM.nextInt(Integer.MAX_VALUE);
        }
        return numbers;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {             
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    private static void printTimeTaken(String caption, long startTime) {
        long elapsedTime = System.nanoTime() - startTime;
        long elapsedMillis = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        System.out.println(String.format("%s : Time taken %,d milliseconds", caption, elapsedMillis));
    }

    public static void main(String[] args) {
        //Let us find a max in an array of 200 million random integers
        int size = 1000_000;

        long startTime = System.nanoTime();
        int[] numbers = generateNumbers(size);
        printTimeTaken("Generating numbers",startTime);

        //Now we use the RecursiveTask
        MaxSearchTask task = new MaxSearchTask(numbers);
        startTime = System.nanoTime();
        //Calling invoke (supported in JDK8) on this task will use builtin ForkJoinPool "commonPool"
        Integer result = (Integer) task.invoke();
        printTimeTaken("Finding max using fork/join", startTime);
        System.out.println(String.format("The maximum number found is %,d in an array of %,d numbers", result,size));
    }
}

