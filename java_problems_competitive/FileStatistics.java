package com.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.stream.Stream;
class FileStatistics {
	static <T> void print(T out) {
		System.out.println(out);
	}
	public static void readFile() throws FileNotFoundException, IOException, ParseException {
		String path = new Scanner(System.in).next();
		File file = new File(path);
		BufferedReader breader = new BufferedReader(new FileReader(file));
		Stream<String> lines = breader.lines();
		long nlines = lines.count();
		print(nlines);
		int nwords = 0; int nchars =0;
	    while(lines.iterator().hasNext()) {
	       nwords+=((String)lines.iterator().next()).split(" ").length;
	       nchars+=((String)lines.iterator().next()).replace(" ","").length();
	    }
	    print(nwords);
	    print(nchars);
	    Process child = Runtime.getRuntime().exec("ls -n "+path);
	    byte[] b = new byte[child.getInputStream().available()];
	    child.getInputStream().read(b);
	    String[] out = new String(b).split(" ");
		print(out[2]);
		print(out[3]);
		SimpleDateFormat fd = new SimpleDateFormat("MMM dd hh:mm");
		print(fd.parse(out[5]+" "+out[6]+" "+out[7]).getTime()/1000);
	}
	public static void main(String args[]) throws Exception {
		readFile();
	}
}