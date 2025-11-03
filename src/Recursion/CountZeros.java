package Recursion;

import java.util.Scanner;

public class CountZeros {
    static int counts=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(1);
            System.exit(0);
        }
        int count=count_zeros(n);
        System.out.println(count);
    }

    private static int count_zeros(int n) {
        if(n==0){
            return counts;
        }
        if(n%10==0){
            counts++;
        }
        return count_zeros(n/10);

    }
}
