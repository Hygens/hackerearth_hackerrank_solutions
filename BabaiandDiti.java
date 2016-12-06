package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;
class FastIO11
{
    BufferedReader br;
    StringTokenizer st;
    OutputStream out;
	public FastIO11() {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = System.out;
	}

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
    void print(Object o) throws IOException {
		out.write(String.valueOf(o).getBytes());
	}
	void println(Object o) throws IOException {
		out.write((String.valueOf(o) + "\n").getBytes());
	}
}

public class BabaiandDiti {	
	public static void main(String[] args) throws IOException {
		FastIO11 sc = new FastIO11();		
		int T = sc.nextInt();				
		while(T-->0) {
			int n = sc.nextInt();
			int[] A = new int[100002];
			for(int i=0;i<n;i++) A[i]=sc.nextInt();
			int start = 0; int j,k;
			for(int i=0;i<10;i++)
	    	{
				j=0;
	    		while(A[j]!=i && j<n)
	    			j++;
	    		k=n-1;
	    		while(k>-1 && A[k]!=i)
	    			k--;
	    		if(start<(k-j+1))
	    			start=k-j+1;
	    	}
			sc.println(start);
		}
	}
}
