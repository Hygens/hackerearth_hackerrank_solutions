package com.uva;

import java.util.Scanner;
import java.math.BigInteger;

public class ReallyStrange
{
	ReallyStrange()
    {
        
    }
    public static void main(String[] args)
    {
        new ReallyStrange().Begin();
    }
    
    private void Begin() {
    	Scanner sc = new Scanner( System.in );        
        while ( sc.hasNextBigInteger() )
        {
            BigInteger n = sc.nextBigInteger();
            if ( n.compareTo( BigInteger.ZERO ) == 0 )
            {
                System.out.println("1");
                continue;
            }
            System.out.println( ((n.pow( 2 )).subtract( n )).add( BigInteger.valueOf(2) ) );
        }
    }
}
