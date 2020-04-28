package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

class FastIO7 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;
	public FastIO7() {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = System.out;
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

	void print(Object o) throws IOException {
		out.write(String.valueOf(o).getBytes());
	}

	void println(Object o) throws IOException {
		out.write((String.valueOf(o) + "\n").getBytes());
	}
}

public class ToTakeorNotToTake {
	public static void main(String args[]) throws Exception {
		FastIO7 br = new FastIO7();
		long[] dp = new long[100];
		long[] dp2 = new long[100];
		int t = br.nextInt();
		int n=0,vv=0;
	   while(t-->0)
	   { 
		String x = "";
	    n = br.nextInt();
	    for(int i=0;i<=n;i++){dp[i]=1l;dp2[i]=1l;}
	    for(int i=1;i<=n;i++)
	     {dp[i]=Long.max(dp[i],dp[i-1]);
	     dp[i]=Long.min(dp2[i],dp2[i-1]);
	       x = br.next().trim();
	       if(!x.equals("N"))
	       {
	        vv = br.nextInt();
	       }
	       if(x.equals("+"))
	       {
	        for(int j=0;j<i;j++)
	        {
	           dp[i] = Long.max(dp[j],Long.max(dp[j]+vv,dp2[j]+vv));
	           dp2[i] = Long.min(dp2[j],Long.min(dp[j]+vv,dp2[j]+vv));
	        }
	       }
	       if(x.equals("*"))
	       {
	        for(int j=0;j<i;j++)
	        {
	           dp[i] = Long.max(dp[j],Long.max(dp[j]*vv,dp2[j]*vv));
	           dp2[i] = Long.min(dp2[j],Long.min(dp[j]*vv,dp2[j]*vv));        }
	       }
	       if(x.equals("/"))
	       {
	        for(int j=0;j<i;j++)
	        {
	           dp[i] = Long.max(dp[j],Long.max(dp[j]/vv,dp2[j]/vv));
	           dp2[i] = Long.min(dp2[j],Long.min(dp[j]/vv,dp2[j]/vv));
	        }
	       }
	        if(x.equals("-"))
	       {
	        for(int j=0;j<i;j++)
	        {
	           dp[i] = Long.max(dp[j],Long.max(dp[j]-vv,dp2[j]-vv));
	           dp2[i] = Long.min(dp2[j],Long.min(dp[j]-vv,dp2[j]-vv));
	        }
	       }
	         if(x.equals("N"))
	       {
	        for(int j=0;j<i;j++)
	        {
	           dp[i] = (Long.max(dp[j],Long.max(-1*dp[j],-1*dp2[j])));
	           dp2[i] = (Long.min(dp2[j],Long.min(-1*dp2[j],-1*dp[j])));
	        }
	       }
	     }
	     br.println(dp[n]);
	   }
	}
}
