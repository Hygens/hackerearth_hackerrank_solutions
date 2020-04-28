package com.tests;

import java.util.Scanner;

public class SidAdnSev {
	public static float pi=3.141593f;
	
	// double tanTheta = Math.tan(Math.toRadians(THETA_MAX));	

	public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			sc.nextLine();
			int a,H,THETA_MAX,cal;
			double div;
			while(t-->0)
			{
				a=sc.nextInt();
				a=a<20?20:a>100?100:a;
			    H=sc.nextInt();
			    H=H<0?1:H>a?a:H;
			    THETA_MAX=sc.nextInt();
			    double tanTheta = Math.tan(Math.toRadians(THETA_MAX));
			    cal= (int)Math.round(((double)a*tanTheta)/2);
				System.out.println(H-cal);	
			}
			sc.close();
	}
	

}

