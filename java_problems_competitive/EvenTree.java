package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;		
class FastIO9 {
	BufferedReader br;
	StringTokenizer st;
	public FastIO9() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}

public class EvenTree {
	private static class Node<T> {
		private final List<Node<T>> childNodes = new ArrayList<>();		
		private void addChildNode(Node<T> node) {
			this.childNodes.add(node);
		}
	}	
	private static int[] decomposeTree(Node<Integer> node) {
		
		int count = 0, edgesToRemove = 0;
		for(Node<Integer> childNode : node.childNodes) {			
			final int[] tmpMetadata = decomposeTree(childNode);
			edgesToRemove += tmpMetadata[1];
			if(tmpMetadata[0] % 2 == 0) {
				edgesToRemove++;
			} else {
				count += tmpMetadata[0];
			}
		}
		count++;
		return new int[]{count, edgesToRemove};
	}	
	public static void main(String[] args) throws IOException {
		final FastIO9 in = new FastIO9();		
		final OutputStream out = System.out;
		final int N = in.nextInt();
		final int M = in.nextInt();		
		final Node<Integer>[] treeNodes = (Node<Integer>[]) new Node[N];
		for(int i = 0; i < M; i++) {			
			final int node1 = in.nextInt() - 1;			
			final int node2 = in.nextInt() - 1;			
			treeNodes[node1] = (treeNodes[node1] == null ? new Node<Integer>() : treeNodes[node1]);
			treeNodes[node2] = (treeNodes[node2] == null ? new Node<Integer>() : treeNodes[node2]);
			if(node1 < node2) {
				treeNodes[node1].addChildNode(treeNodes[node2]);
			} else {
				treeNodes[node2].addChildNode(treeNodes[node1]);
			}
		}
		final int[] metadata = decomposeTree(treeNodes[0]);
		out.write((String.valueOf(metadata[1])+"\n").getBytes());		
	}
}