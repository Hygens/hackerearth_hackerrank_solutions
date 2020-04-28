package com.tests;

import java.util.*;

class Tree {
	// List of node data values:
	Vector<Integer> values;
	// Total number of nodes in the tree:
	private int count;

	Tree() {
		this.values = new Vector<Integer>();
		this.count = 0;
	}

	static class Node {
		int data;
		Node left;
		Node right;

		Node() {
			this.data = -1;
			this.left = null;
			this.right = null;
		}
	}

	void inOrder(Node root, int levels) {
		if (root != null) {
			// If there are still unfilled levels, fill left subtree:
			if (levels > 0) {
				// Create a new left child node:
				root.left = new Node();
				inOrder(root.left, levels - 1);
			}

			// Set node data:
			root.data = values.elementAt(count);
			count++;

			// If there are still unfilled levels, fill right subtree:
			if (levels > 0) {
				// Create a new right child node:
				root.right = new Node();
				inOrder(root.right, levels - 1);
			}
		}
	}
	boolean checkLeft(Node left) {
		if (left != null) {
			if (!checkBST(left.left))
				return false;
			if (left.left != null && left.data <= left.left.data)
				return false;
			if (left.left != null && left.left.right != null && left.data <= left.left.right.data)
				return false;
			if (left.left != null && left.left.left != null && left.data <= left.left.left.data)
				return false;
		}
		return true;		
	}	
	boolean checkRight(Node right) {
		if (right != null) {
			if (!checkBST(right.right))
				return false;
			if (right.right != null && right.data >= right.right.data)
				return false;
			if (right.left != null && right.data >= right.left.data)
				return false;
			if (right.left != null && right.left.right != null && right.data >= right.left.right.data)
				return false;
			if (right.left != null && right.left.left != null && right.data >= right.left.left.data)
				return false;
			if (right.right != null && right.right.right != null && right.data >= right.right.right.data)
				return false;
			if (right.right != null && right.right.left != null && right.data >= right.right.left.data)
				return false;
		}
		return true;		
	}
	boolean checkBST(Node root) {
		if (root != null) {
			if (!checkBST(root.left))
				return false;	
			if (!checkBST(root.right))
				return false;			
		} 				
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height = Integer.parseInt(scanner.nextLine());
		// Read data values for tree's nodes:
		Tree tree = new Tree();
		int[] arr = Arrays.asList(scanner.nextLine().trim().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		for (Integer i : arr) {
			tree.values.add(i);
		}
		scanner.close();

		// Fill tree:
		Node root = new Node();
		tree.inOrder(root, height);

		// Print result:
		System.out.println((tree.checkBST(root) == true) ? "Yes" : "No");

	}
}
