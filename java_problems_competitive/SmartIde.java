package com.tests;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SmartIde {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
			while(sc.hasNextLine())
			{
				String curLine = sc.nextLine();
				if(curLine.contains("//"))
				{
					System.out.println(curLine.substring(curLine.indexOf("//")).trim());
				}
				else if(curLine.contains("/*"))
				{
					int idxStart = curLine.indexOf("/*");
					if(curLine.contains("*/"))
					{
						int idxEnd = curLine.indexOf("*/")+2;
						System.out.println(curLine.substring(idxStart,idxEnd).trim());
					}
					else
					{
						while(sc.hasNextLine())
						{
							while(!curLine.contains("*/"))
							{
								System.out.println(curLine.trim());
								curLine = sc.nextLine();
							}
							System.out.println(curLine.substring(0,curLine.indexOf("*/")+2).trim());
							break;
						}
					}
				}
			}
	    }
}
