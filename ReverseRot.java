package com.challenges;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ReverseRot {
	static <K, V> Map.Entry<K, V> entry(K key, V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }
	
	static <K, U> Collector<Map.Entry<K, U>, ?, Map<K, U>> entriesToMap() {
        return Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue());
    }
	
	static Map<Character, Integer> getPositions() {
        return Collections.unmodifiableMap(Stream.of(
                entry('A', 0),entry('B', 1),entry('C', 2),entry('D', 3),entry('E', 4),
                entry('F', 5),entry('G', 6),entry('H', 7),entry('I', 8),entry('J', 9),
                entry('K', 10),entry('L', 11),entry('M', 12),entry('N', 13),entry('O', 14),
                entry('P', 15),entry('Q', 16),entry('R', 17),entry('S', 18),entry('T', 19),
                entry('U', 20),entry('V', 21),entry('W', 22),entry('X', 23),entry('Y', 24),
                entry('Z', 25),entry('_', 26),entry('.', 27))
        		.collect(entriesToMap()));
    }

    public static void main(String[] args) {
    	String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
    	Map<Character,Integer> positions = getPositions();
        Scanner in = new Scanner(System.in);
        String[] vals = in.nextLine().trim().split(" ");
        while(!vals[0].equals("0")) {        	
            int rot = Integer.parseInt(vals[0]);
            String res = "";
            for(int i=vals[1].length()-1;i>=0;i--){
            	int pos = positions.get(vals[1].charAt(i))+rot;
            	if (pos>27) pos=pos-28;
            	res+=letters.charAt(pos);
            }
            System.out.println(res);
            vals = in.nextLine().split(" ");
        }
    }
}