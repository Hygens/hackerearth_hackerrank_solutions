package com.tests;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Md5Sample {

	
	    public static void main(String[] args) throws NoSuchAlgorithmException {
	       Scanner sc = new Scanner(System.in);
	       String s = sc.nextLine().trim();
	       MessageDigest m = MessageDigest.getInstance("MD5");
	       m.update(s.getBytes(),0,s.length());
	       System.out.println(new BigInteger(1,m.digest()).toString(16).toLowerCase());
	    }


}
