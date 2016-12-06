package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;
class FastIO
{
    BufferedReader br;
    StringTokenizer st;
    
    public FastIO()
    {
        br = new BufferedReader(new
                 InputStreamReader(System.in));
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
}

public class BinaryQueries {	
	public static void main(String[] args) throws IOException {
		FastIO sc = new FastIO();
		OutputStream out = System.out;
		int n = sc.nextInt(); 
		int q = sc.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) A[i]=sc.nextInt();		
		for(int j=0;j<q;j++) {
			int Q = sc.nextInt();
			if (Q==0) {
				int L = sc.nextInt(); 
				int R = sc.nextInt();
				if (A[R-1]==0) out.write("EVEN\n".getBytes());
				else out.write("ODD\n".getBytes());				
			} else {
				int X = sc.nextInt();
				A[X-1] = ~A[X-1] & 1;				
			}
		}
	}
}
