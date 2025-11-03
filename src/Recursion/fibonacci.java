package Recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=fib(n);
        System.out.println(res);
    }

    private static int fib(int n) {
        if(n<2)return n;
        return fib(n-1)+fib(n-2);
    }
}
