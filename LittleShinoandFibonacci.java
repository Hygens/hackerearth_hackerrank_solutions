package com.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class LittleShinoandFibonacci {
    static long fib(long n) {
        long A[][] = { { 1, 1 }, { 1, 0 } };
        if (n == 0)
            return 0;
        power(A, n - 1);
        return A[0][0]%10000;
    }    
    static void multiply(long X[][], long Y[][]) {
        long x = X[0][0] * Y[0][0] + X[0][1] * Y[1][0];
        long y = X[0][0] * Y[0][1] + X[0][1] * Y[1][1];
        long z = X[1][0] * Y[0][0] + X[1][1] * Y[1][0];
        long w = X[1][0] * Y[0][1] + X[1][1] * Y[1][1];
        X[0][0] = x;
        X[0][1] = y;
        X[1][0] = z;
        X[1][1] = w;
    }    
    static void power(long X[][], long n) {
        long i;
        long A[][] = { { 1, 1 }, { 1, 0 } };
        i=2;
        while (i <= n){
            multiply(X, A); i++;
        }
    }
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n>0) {
			String[] line = br.readLine().trim().split(" ");
			long l = Long.parseLong(line[0]);
			long r = Long.parseLong(line[1]);
			int s = 0;
			long i = l-1L;			
			while (i<r) { 
				s+=fib(i); 
				i++; 
			}
			System.out.println(s%1000000007);
			n--;
		}
	}
}
