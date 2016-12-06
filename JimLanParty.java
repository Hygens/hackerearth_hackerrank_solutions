package com.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class FastIO11 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO11() {
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
	
	long nextLong() {
		return Long.parseLong(next());
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

class Node
{
	public int game;
	public List<Node> connections = new ArrayList<>();
	public int ID;
}

class Graph
{
	public int[] group_size_for_game;
	public Map<Integer, Node> nodes = new HashMap<Integer, Node>();

	public Graph()
	{
	}
}

class DFSState
{
	public Map<Integer, Boolean> node_visited = new HashMap<>();
	public Map<Integer, Integer> games_visited = new HashMap<>();
	public List<Integer> games_connected = new ArrayList<>();
	public Map<Integer, Boolean> terminating_nodes = new HashMap<>();
}

public class JimLanParty {
	static Graph g = new Graph();
	static List<DFSState> dfs_states;

	static boolean DFS(Node node, DFSState dfs_state)
	{
		if (!dfs_state.node_visited.containsKey(node.ID))
		{
			if (dfs_state.games_visited.containsKey(node.game))
				dfs_state.games_visited.put(node.game,dfs_state.games_visited.get(node.game)+1);
			else
				dfs_state.games_visited.put(node.game, 1);

			if (dfs_state.games_visited.getOrDefault(node.game, -1) == g.group_size_for_game[node.game] &&
				g.group_size_for_game[node.game] > 1)
				dfs_state.games_connected.add(node.game);
		}

		dfs_state.node_visited.put(node.ID, true);

		boolean res = false;
		boolean visited_atleast_one = false;
		for(Node n: node.connections)
		{
			boolean visited = false;
			visited = dfs_state.node_visited.getOrDefault(n.ID, visited);

			if (!visited)
			{
				res |= DFS(n, dfs_state);
				visited_atleast_one = true;
			}
		}

		if (!visited_atleast_one)
			dfs_state.terminating_nodes.put(node.ID, true);

		return res;
	}

	

	public static void main(String[] args) throws IOException {		
		FastIO11 in = new FastIO11();
		OutputStream out = System.out;
		int N = in.nextInt();
		int M = in.nextInt();
		int Q = in.nextInt();

		for (int i = 1; i <= N; ++i)
		{
			Node node = new Node();
			node.ID = i;
			g.nodes.put(i,node);
		}

		g.group_size_for_game = new int[M + 1];

		for (int i = 1; i <= N; ++i )
		{
			g.nodes.get(i).game = in.nextInt();
			g.group_size_for_game[g.nodes.get(i).game]++;
		}

		Map<Integer, Integer> connections_which_enabled_group = new HashMap<Integer, Integer>();
		List<DFSState> dfs_states = new ArrayList<>();

		for (int i = 0; i < Q; ++i)
		{
			int start = in.nextInt();
			int end = in.nextInt();
			g.nodes.get(start).connections.add(g.nodes.get(end));
			g.nodes.get(end).connections.add(g.nodes.get(start));

			DFSState dfs_state_to_use = null;

			for(DFSState dfs_state: dfs_states)
			{
				if (dfs_state.node_visited.containsKey(start) || dfs_state.node_visited.containsKey(end))
					dfs_state_to_use = dfs_state;
			}

			if (dfs_state_to_use == null)
			{
				dfs_state_to_use = new DFSState();
				dfs_states.add(dfs_state_to_use);
			}

			DFS(g.nodes.get(start), dfs_state_to_use);
			for (int game: dfs_state_to_use.games_connected)
				if (!connections_which_enabled_group.containsKey(game))
					connections_which_enabled_group.put(game, i);
		}

		for (int i = 1; i <= M; ++i)
		{
			int connection = -1;
			if (connections_which_enabled_group.containsKey(i))
				connection = connections_which_enabled_group.get(i) + 1;
			else if (g.group_size_for_game[i] == 1)
				connection = 0;

			out.write((String.valueOf(connection)+"\n").getBytes());
		}
	}

}
