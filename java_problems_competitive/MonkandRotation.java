package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
class FastIN
{
    BufferedReader br;
    StringTokenizer st;
    
    public FastIN()
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

public class MonkandRotation {	
	public static void main(String[] args) throws IOException {
		FastIN sc = new FastIN();
		OutputStream out = System.out;
		int t =  sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<String> q = new ArrayList<>();
			for(int i=0;i<n;i++) q.add(sc.next());
			Collections.rotate(q, k);
			out.write((String.join(" ", q)+"\n").getBytes());			
		}
		
	}
}
