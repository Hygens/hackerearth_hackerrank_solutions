package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;
class FastIO9 {
	BufferedReader br;
	StringTokenizer st;
	OutputStream out;
	public FastIO9() {
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
public class RoyAndLeds {
	public static final byte BALCK = 0;
	public static final byte BLUE = 1;
	public static final byte GREEN = 2;
	public static final byte CYAN = 3;
	public static final byte RED = 4;
	public static final byte MAGENTA = 5;
	public static final byte YELLOW = 6;
	public static final byte WHITE = 7;
	private static String checkLeds(int t, int r, int g, int b) {
		String result = "%d %d %d %d %d %d %d %d";
		byte[] states = new byte[t];
		int[] resultArray = new int[8];
		boolean redFlag = false;
		boolean greenFlag = false;
		boolean blueFlag = false;
		for (int i = 0; i < states.length; i++) {
			if (i == 0) {
				resultArray[BALCK]++;
				continue;
			}
			if (i % r == 0)
				redFlag = !redFlag;
			if (i % g == 0)
				greenFlag = !greenFlag;
			if (i % b == 0)
				blueFlag = !blueFlag;
			if (redFlag)
				states[i] |= RED;
			if (greenFlag)
				states[i] |= GREEN;
			if (blueFlag)
				states[i] |= BLUE;
			switch (states[i]) {
			case BALCK:
				resultArray[BALCK]++;
				break;
			case BLUE:
				resultArray[BLUE]++;
				break;
			case GREEN:
				resultArray[GREEN]++;
				break;
			case CYAN:
				resultArray[CYAN]++;
				break;
			case RED:
				resultArray[RED]++;
				break;
			case MAGENTA:
				resultArray[MAGENTA]++;
				break;
			case YELLOW:
				resultArray[YELLOW]++;
				break;
			case WHITE:
				resultArray[WHITE]++;
				break;
			}
		}
		return String.format(result, resultArray[RED], resultArray[GREEN], resultArray[BLUE], resultArray[YELLOW],
				resultArray[CYAN], resultArray[MAGENTA], resultArray[WHITE], resultArray[BALCK]);
	}
	public static void main(String[] args) throws Exception {
		FastIO9 br = new FastIO9();
		int t = br.nextInt();
		int r = br.nextInt();
		int g = br.nextInt();
		int b = br.nextInt();
		br.println(checkLeds(t, r, g, b));
	}
}
