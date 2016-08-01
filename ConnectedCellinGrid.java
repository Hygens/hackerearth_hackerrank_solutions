package com.tests;
import java.util.*;
class Matrix {
	private int currentArrWidth;
	private int currentArrHeight;
	private String[][] matrix;
	public Matrix(int currentArrWidth, int currentArrHeight, String[][] matrix) {
		this.currentArrHeight = currentArrHeight;
		this.currentArrWidth = currentArrWidth;
		this.matrix = matrix;
	}
	public int getCurrentArrWidth() {
		return currentArrWidth;
	}
	public int getCurrentArrHeight() {
		return currentArrHeight;
	}
	public String[][] getMatrix() {
		return matrix;
	}
}
public class ConnectedCellinGrid {
	private static int currentDepth;
	
	public static int findMaxDepth(String[][] n, boolean[][] bool, int i, int j) {
		if (i >= 0 && i < n.length && j >= 0 && j < n[0].length && bool[i][j] != true && !n[i][j].equals("0")) {
			currentDepth++;
			bool[i][j] = true;
			findMaxDepth(n, bool, i - 1, j);
			findMaxDepth(n, bool, i + 1, j);
			findMaxDepth(n, bool, i, j - 1);
			findMaxDepth(n, bool, i, j + 1);
			findMaxDepth(n, bool, i + 1, j + 1);
			findMaxDepth(n, bool, i - 1, j - 1);
			findMaxDepth(n, bool, i + 1, j - 1);
			findMaxDepth(n, bool, i - 1, j + 1);
		}
		return currentDepth;
	}
	public static int traverseArray(Matrix matrix) {
		int currentArrHeight = matrix.getCurrentArrHeight();
		int currentArrWidth = matrix.getCurrentArrWidth();
		boolean[][] visitedBoolArr = new boolean[currentArrHeight][currentArrWidth];
		int depth, maxDepth = 0;
		if (matrix.getMatrix() != null) {
			for (int i = 0; i < currentArrHeight; i++) {
				for (int j = 0; j < currentArrWidth; j++) {
					if (matrix.getMatrix()[i][j].equals("1") && 
						visitedBoolArr[i][j] == false) {
						currentDepth = 0;
						depth = findMaxDepth(matrix.getMatrix(), visitedBoolArr, i, j);
						if (depth > maxDepth) {
							maxDepth = depth;
						}
					}
				}
			}
		}
		return maxDepth;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = Integer.parseInt(sc.nextLine().trim()); 
		int n = Integer.parseInt(sc.nextLine().trim());
		String[][] mArr = new String[m][n];
		for(int i=0;i<m;i++) {
			mArr[i]=sc.nextLine().trim().split(" ");
		}
		Matrix matrix = new Matrix(n,m,mArr);
		for(String[] sarr: mArr)
			System.out.println(Arrays.toString(sarr));
		System.out.println(traverseArray(matrix));		
	}
}
