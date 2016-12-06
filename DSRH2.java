package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class FastIO7 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO7() {
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

public class DSRH2 {	
	private static class Node implements Comparable<Node>{
		final int id;
		int distance = Integer.MAX_VALUE;
		final Map<Node, Integer> linkedNodes = new HashMap<>();
		
		private Node(int id) {
			this.id = id;
		}	
		private void addLinkedNode(Node node, Integer distance) {
			linkedNodes.put(node, distance);
		}		
		@Override
		public int compareTo(Node o) {
			return this.distance - o.distance;
		}		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (id != other.id)
				return false;
			return true;
		}
	}
	private static void updateNodeDistances(Node[] graphNodes, int source) {		
		final PriorityQueue<Node> pQ = new PriorityQueue<>();
		pQ.addAll(Arrays.asList(graphNodes));
		final Node sourceNode = graphNodes[source];		
		pQ.remove(sourceNode); 
		sourceNode.distance = 0;
		pQ.add(sourceNode);		
		while(!pQ.isEmpty()) {
			final Node node = pQ.poll();			
			for(Entry<Node, Integer> linkedNodeEntry : node.linkedNodes.entrySet()) {
				final Node linkedNode = linkedNodeEntry.getKey();
				final int linkedNodeEdgeWeight = linkedNodeEntry.getValue();
				int targetDistance = node.distance + linkedNodeEdgeWeight;
				if(!(node.distance == Integer.MAX_VALUE) && targetDistance < linkedNode.distance) {					
					pQ.remove(linkedNode);
					linkedNode.distance = targetDistance;
					pQ.offer(linkedNode);
				}
			}
		}		
	}	
	public static void main(String[] args) throws IOException {
		final FastIO7 in = new FastIO7();		
		OutputStream out = System.out;
		int T = in.nextInt();		
		while(T-- > 0) {
			final int N = in.nextInt();
			final int M = in.nextInt();
			
			final Node[] graphNodes = new Node[N];
			for(int j = 0; j < M; j++) {
				final int x = in.nextInt() - 1;
				Node xNode = graphNodes[x];
				if(xNode == null) {
					xNode = new Node(x);
					graphNodes[x] = xNode;
				}
				final int y = in.nextInt() - 1;				
				Node yNode = graphNodes[y];
				if(yNode == null) {
					yNode = new Node(y);
					graphNodes[y] = yNode;
				}				
				final int r = in.nextInt();				
				if(xNode.linkedNodes.get(yNode) == null || xNode.linkedNodes.get(yNode) > r ) {					
					xNode.addLinkedNode(yNode, r);
					yNode.addLinkedNode(xNode, r);
				}
			}			
			final int S = in.nextInt() - 1;
			updateNodeDistances(graphNodes, S);
			for(Node node : graphNodes) {
				if(node.distance != 0) {
					out.write((String.valueOf(node.distance == Integer.MAX_VALUE ? -1 : node.distance) + " ").getBytes());
				}
			}
			out.write("\n".getBytes());			
		}		
	}
}