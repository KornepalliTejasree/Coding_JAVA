package DP;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
        String s2="GTCGTTCGGAATGCCGTTGCTCTGTAAA";
        char c[]=s1.toCharArray();
        char ch[]=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        String s3="";
        String s4="";
        for (char cc : c) {
            s3+=cc;
        }
        for (char cc : ch) {
            s4+=cc;
        }
        if(s3.contains(s4)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
