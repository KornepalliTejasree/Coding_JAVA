package Recursion;

import java.util.Scanner;

public class ReverseBit {
    static int rev=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=reverse(n);
        System.out.println(rev);
    }

    private static int reverse(int n) {
        if(n==0){
            return rev;
        }
        rev=rev*10+n%10;
        return reverse(n/10);
    }
}
