package DP;

import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++)
        coins[i]=sc.nextInt();
        int balance=sc.nextInt();
       int dp[]=new int[balance+1];
        for(int i=0;i<n;i++){
            for(int j=coins[i];j<=balance;j++){
                dp[j]=Math.min(dp[i],dp[j-coins[i]]+1);
            }
        }
        System.out.println(dp[balance]);
    }
}
