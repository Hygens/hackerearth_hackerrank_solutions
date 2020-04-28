package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.StringTokenizer;
class FastIn
{
    BufferedReader br;
    StringTokenizer st;
    
    public FastIn()
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

public class MonkandWelcomeProblem {	
	public static void main(String[] args) throws IOException {
		FastIn sc = new FastIn();
		OutputStream out = System.out;
		int n = sc.nextInt(); 
		int[] q = new int[n];
		for(int i=0;i<n;i++) q[i]=sc.nextInt();
		for(int i=0;i<n;i++) q[i]+=sc.nextInt();
		out.write(Arrays.toString(q)
				  .replace("[", "")
				  .replace(",", "")
				  .replace("]", "")
				  .getBytes());
	}
}
