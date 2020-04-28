package com.tests;

import java.util.*;
import javax.swing.*;

public class SuperQueensOnChessBoard {
	public static int N;
	public static Set knightMove;
	public static int noOfMoves = 0;
	public static int max = 0;

	public static void main(String args[]) {
		String in = JOptionPane.showInputDialog(null, "Enter the size of board");
		N = Integer.parseInt(in);
		int ans[] = new int[N];
		Set col = new HashSet();
		Set diag45 = new HashSet();
		Set diag135 = new HashSet();
		knightMove = new HashSet();
		ans = queens(1, col, diag45, diag135);
		System.out.println("Maximum No. of Super Queens for the " + N + "x" + N + "board:" + max);
	}

	public static int[] queens(int k, Set col, Set diag45, Set diag135) {
		int sol[] = new int[N + 1];
		OrdSet oSet;
		int j;
		if (k < N + 1) {
			if (noOfMoves == N) {
				System.out.println("Maximum No. of Moves for the " + N + "x" + N + "board:" + max);
				System.exit(0);
			} else {
				for (j = 1; j < N + 1; j++) {
					if (!col.contains(j) && !diag45.contains(j - k) && !diag135.contains(j + k) && chkPos(k, j)) {
						sol[k] = j;
						col.add(j);
						diag45.add(j - k);
						diag135.add(j + k);
						// Adding Knight Moves
						oSet = new OrdSet(k, j);
						knightMove.add(oSet);
						noOfMoves++;
						if (max < noOfMoves)
							max = noOfMoves;
						queens(k + 1, col, diag45, diag135);
						diag45.remove(j - k);
						diag135.remove(j + k);
						col.remove(j);
						knightMove.remove(oSet);
						noOfMoves--;
					}
				}
				queens(k + 1, col, diag45, diag135);
			}
		}
		return sol;
	}

	public static boolean chkPos(int x, int y) {
		Iterator it = knightMove.iterator();
		boolean retValue = true;
		if (knightMove.size() == 0)
			return true;
		while (it.hasNext()) {
			OrdSet oSet = (OrdSet) it.next();
			if (Math.abs(oSet.getX() - x) < 3.0 && Math.abs(oSet.getY() - y) < 3.0) {
				retValue = false;
			}
		}
		return retValue;
	}

	public static class OrdSet {
		private int X;
		private int Y;

		OrdSet() {
			X = 0;
			Y = 0;
		}

		OrdSet(int x, int y) {
			X = x;
			Y = y;
		}

		public int getX() {
			return X;
		}

		public int getY() {
			return Y;
		}
	}
}
