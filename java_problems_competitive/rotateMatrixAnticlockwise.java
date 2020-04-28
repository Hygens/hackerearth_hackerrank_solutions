package com.tests;
import java.util.Scanner;
public class rotateMatrixAnticlockwise {
    public static void display(String[][] arr){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println();
        }
    }
    public static String[][] rotation(String[][] arr){
        return swapRows(transpose(arr));
    }
    public static String[][] transpose(String[][] arr){
        String[][] nw=new String[arr.length][arr.length];
        for(int i=0;i<arr.length;i++)
            for (int j = 0; j < arr.length; j++) {
                nw[i][j]=arr[j][i];
            }
        return nw;
    }
    public static String[][] swapRows(String[][] arr) {
        for (int  i = 0, k = arr.length - 1; i < k; ++i, --k) {
            String[] x = arr[i];
            arr[i] = arr[k];
            arr[k] = x;
        }
        return arr;
    }
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        String[] vars=in.nextLine().split(" ");
        int m=Integer.parseInt(vars[0]); int n=Integer.parseInt(vars[1]); int r=Integer.parseInt(vars[2]);
        String[][] matrix = new String[m][n];
        for(int k=0;k<m;k++) {
        	matrix[k]=in.nextLine().split(" ");
        }
        in.close();
        for(int j=0;j<r;j++)
        	matrix=rotation(matrix);
        display(matrix);
    }
}
