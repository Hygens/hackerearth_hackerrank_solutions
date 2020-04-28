package com.tests;

import java.util.Arrays;
import java.util.Scanner;

public class MandragoraForest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for(int k = 0; k < T; k++) {
            int N = scanner.nextInt();
            int[] data = new int[N];
            
            //read input and calculate sum
            long sum = 0;
            for(int i = 0; i < N; i++) {
                data[i] = scanner.nextInt();
                sum += data[i];
            }
            
            //sort and initiate variables
            Arrays.sort(data);
            long S = 1, P = sum, var = 0;
            
            //eat one by one and calculate the 
            //experience from thie fight with the rest
            for(int i = 0; i < N; i++) {
                S++;
                //eaten - update the sum and new exp
                sum -= data[i];
                var = sum*S;
                //save the biggest solution
                if(var > P) P = var;
            }

            System.out.println(P);
        }
    }
}
