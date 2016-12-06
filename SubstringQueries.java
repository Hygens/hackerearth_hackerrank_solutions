package com.test;

public class SubstringQueries {
    private final int R;       
    private int[][] dfa;       

    private char[] pattern;    
    private String pat;        

   public SubstringQueries(String pat) {
        this.R = 256;
        this.pat = pat;

        int M = pat.length();
        dfa = new int[R][M]; 
        dfa[pat.charAt(0)][0] = 1; 
        for (int X = 0, j = 1; j < M; j++) {
            for (int c = 0; c < R; c++) 
                dfa[c][j] = dfa[c][X];      
            dfa[pat.charAt(j)][j] = j+1;   
            X = dfa[pat.charAt(j)][X];      
        } 
    } 

    public SubstringQueries(char[] pattern, int R) {
        this.R = R;
        this.pattern = new char[pattern.length];
        for (int j = 0; j < pattern.length; j++)
            this.pattern[j] = pattern[j];
        
        int M = pattern.length;
        dfa = new int[R][M]; 
        dfa[pattern[0]][0] = 1; 
        for (int X = 0, j = 1; j < M; j++) {
            for (int c = 0; c < R; c++) 
                dfa[c][j] = dfa[c][X];      
            dfa[pattern[j]][j] = j+1;       
            X = dfa[pattern[j]][X];         
        } 
    } 

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        for (i = 0, j = 0; i < N && j < M; i++) {
            j = dfa[txt.charAt(i)][j];
        }
        if (j == M) return i - M;    
        return N;                    
    }

    public int search(char[] text) {
        int M = pattern.length;
        int N = text.length;
        int i, j;
        for (i = 0, j = 0; i < N && j < M; i++) {
            j = dfa[text[i]][j];
        }
        if (j == M) return i - M;    
        return N;                    
    }

    public static void main(String[] args) {
    	String pat = args[0];
        String txt = args[1];
        char[] pattern = pat.toCharArray();
        char[] text    = txt.toCharArray();

        SubstringQueries kmp1 = new SubstringQueries(pat);
        int offset1 = kmp1.search(txt);

        SubstringQueries kmp2 = new SubstringQueries(pattern, 256);
        int offset2 = kmp2.search(text);

        System.out.println("text:    " + txt);

        System.out.print("pattern: ");
        for (int i = 0; i < offset1; i++)
        	System.out.print(" ");
        System.out.println(pat);

        System.out.print("pattern: ");
        for (int i = 0; i < offset2; i++)
        	System.out.print(" ");
        System.out.println(pat);
    }
}