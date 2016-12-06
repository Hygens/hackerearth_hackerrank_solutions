package com.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class FastIO4
{
    BufferedReader br;
    StringTokenizer st;    
    public FastIO4()
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
public class MancunianAndMultiplicativeQueries {
	public static void main(String args[]) throws Exception {
		FastIO4 br = new FastIO4();
		OutputStream out = System.out;
		long M = 1000000007;
		int n = br.nextInt();
		int c = br.nextInt();
		int q = br.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++) A[i]=br.nextInt();
		int[] FUNC = new int[n+1];
		for(int i=0;i<n+1;i++) FUNC[i] = br.nextInt();
		long p = 1;
		for (int i = 0 ; i<q ; i++) {
			int l = br.nextInt();
			int r = br.nextInt();
			int[] sub = Arrays.copyOfRange(A, l-1, r);
			Map<Integer, Long> freq = IntStream.of(sub).boxed().
	                collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));			
			for(int j = 1; j <= c ; j++) {	
				Long idx = freq.get(j);
				if (idx!=null)
					p=((p%M)*(FUNC[idx.intValue()]%M))%M;
				else
					p=((p%M)*(FUNC[0]%M))%M;
			}
		}
		out.write((String.valueOf(p)+"\n").getBytes());
	}
}
