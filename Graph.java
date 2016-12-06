package com.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

final class Ingraph {    
    private static final String CHARSET_NAME = "UTF-8";
    private static final Pattern WHITESPACE_PATTERN
        = Pattern.compile("\\p{javaWhitespace}+");
    private BufferedReader scanner;

    public Ingraph() throws UnsupportedEncodingException {
        scanner = new BufferedReader(new InputStreamReader(System.in,CHARSET_NAME));       
    }

    public Ingraph(BufferedReader scanner) {
        if (scanner == null) throw new NullPointerException("argument is null");
        this.scanner = scanner;
    }
    
    public boolean exists()  {
        return scanner != null;
    }
    
    public String readLine() {
        String line = null;
        try {
            line = scanner.readLine();
        }
        catch (IOException e) {			
			e.printStackTrace();
		}
        return line;
    }

    public String[] readAllStringsInArray(BufferedReader scanner) throws IOException {
        String[] tokens = WHITESPACE_PATTERN.split(scanner.readLine());
        if (tokens.length == 0 || tokens[0].length() > 0)
            return tokens;
        String[] decapitokens = new String[tokens.length-1];
        for (int i = 0; i < tokens.length-1; i++)
            decapitokens[i] = tokens[i+1];
        return decapitokens;
    }

    public String[] readAllLinesInArray(BufferedReader scanner) {
        return scanner.lines().toArray(String[]::new);
    }

    public int[] readAllInts() throws IOException {
        String[] fields = readAllStringsInArray(this.scanner);
        int[] vals = new int[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Integer.parseInt(fields[i]);
        return vals;
    }

    public double[] readAllDoubles() throws IOException {
        String[] fields = readAllStringsInArray(this.scanner);
        double[] vals = new double[fields.length];
        for (int i = 0; i < fields.length; i++)
            vals[i] = Double.parseDouble(fields[i]);
        return vals;
    }
    
    public void close() throws IOException {
        scanner.close();  
    }

    public int[] readInts() throws IOException {
        return new Ingraph().readAllInts();
    }

    public double[] readDoubles() throws IOException {
        return new Ingraph().readAllDoubles();
    }   
    
    public static void main(String[] args) {
        Ingraph Ingraph;
    }
}


class BagGraph<Item> implements Iterable<Item> {
    private Node<Item> first;    
    private int N; 
    
    private static class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public BagGraph() {
        first = null;
        N = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void add(Item item) {
        Node<Item> oldfirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);  
    }
    
    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }
}

class CycleGraph {
    private boolean[] marked;
    private int[] edgeTo;
    private List<Stack<Integer>> cycle;

    public CycleGraph(Graph G) {        
        marked = new boolean[G.V()];
        edgeTo = new int[G.E()];
        for (int v = 1; v <= G.V(); v++)
            if (!marked[v])
                dfs(G, -1, v);
    }
    
    public Iterable<Stack<Integer>> cycle() {
        return cycle;
    }

    private void dfs(Graph G, int u, int v) {
        marked[v] = true;
        cycle = new ArrayList<Stack<Integer>>();
        Stack<Integer> stack = null;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, v, w);
            }            
            else if (w != u) {
                stack = new Stack<Integer>();
                for (int x = v; x != w; x = edgeTo[x]) {
                    stack.push(x);
                }
                stack.push(w);
                stack.push(v);
            }
            cycle.add(stack);
        }
    }
}

public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int V;
    private int E;
    private BagGraph<Integer>[] adj;
    
    @SuppressWarnings("unchecked")
	public Graph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be not negative");
        this.V = V;
        this.E = 0;
        adj = (BagGraph<Integer>[]) new BagGraph[V+1];
        for (int v = 1; v <= V; v++) {
            adj[v] = new BagGraph<Integer>();
        }
    }

    public Graph(Ingraph Ingraph) throws NumberFormatException, IOException {
        this(Ingraph.readAllInts()[0]);
        int E = Ingraph.readAllInts()[1];
        if (E < 0) throw new IllegalArgumentException("Number of edges must be nonnegative");
        for (int i = 1; i <= E; i++) {
        	int[] vals = Ingraph.readAllInts();
            int v = vals[0];
            int w = vals[1];
            addEdge(v,w);
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        E++;
        System.out.println(E);
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
       return adj[v];
    }

    public int degree(int v) {
       return adj[v].size();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 1; v <= V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Ingraph Ingraph = new Ingraph();
        Graph G = new Graph(Ingraph);
        CycleGraph C = new CycleGraph(G);
        System.out.println(G);
    }

}
