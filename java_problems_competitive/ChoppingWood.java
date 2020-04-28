package com.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class FastIO2 {
	BufferedReader br;
	StringTokenizer st;

	public FastIO2() {
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

public class ChoppingWood {	
	private static int REMOVED = -1;
	static void process_add(Integer[] ints,Map<Integer,Integer[]> ef, PriorityQueue<Integer[]> pq) {
		Integer[] _in = {ints[2],ints[1],ints[0]};
		ef.put(ints[2], _in);
		pq.add(_in);
	}
	static int process_pop(Map<Integer,Integer[]> ef, PriorityQueue<Integer[]> pq) {
		Integer[] _in = pq.poll();
		if (_in[2]!=REMOVED) {
			ef.remove(_in[2]);
			return _in[2];
		}
		return -1;
	}
	static void process_remove(Integer i, Map<Integer,Integer[]> ef, PriorityQueue<Integer[]> pq) {
		Integer[] ints = ef.remove(i);
		ints[2] = REMOVED;
	}
	public static void main(String[] args) throws IOException {
		FastIO2 sc = new FastIO2();
		OutputStream out = System.out;
		Comparator<Integer[]> cmp = new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				// TODO Auto-generated method stub
				return Arrays.stream(o1).reduce( 0,(a, b) -> a + b)-
					   Arrays.stream(o2).reduce( 0,(a, b) -> a + b);
			}
			
		};
		PriorityQueue<Integer[]> pq = new PriorityQueue<>(cmp);
		Map<Integer,Integer[]> ef = new HashMap<>();
		Map<Integer,AtomicInteger> dict = new ConcurrentHashMap<>();		
		List<Integer> vals = new ArrayList<>();
		List<String> result = new ArrayList<>();
		int t = sc.nextInt(); 
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			dict.computeIfAbsent(n, x->new AtomicInteger(0)).incrementAndGet();
			vals.add(n);
		}
		for(int j=1;j<t+2;j++) {
			Integer[] ent = {j,j,dict.get(j).get()};
			process_add(ent,ef,pq);
		}
		for(Integer k: vals) {
			int ant = ef.get(k)[0];
			int res = process_pop(ef,pq);
			if (res!=-1) result.add(String.valueOf(res));
			process_remove(k,ef,pq);
			Integer[] adds = {k,k,ant-1};
			process_add(adds,ef,pq);
		}
		Integer[][] objs = (Integer[][])pq.toArray();
		if (((objs[0][2]).intValue() != t+1) || (objs[0][0] != 1))
		    out.write ("Error\n".getBytes());
		else{
		    for(int l=0;l<result.size();l+=100)
		        out.write("".join("\n",(CharSequence[]) result.subList(1, 1+100).toArray()).getBytes());
		}
	}
}
