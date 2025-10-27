package DP;

import java.util.Arrays;
import java.util.Scanner;
// It is not efficient and it will take more number of iterations so we will use @iterativefibonacci
public class TopDownApproach {
    static int dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        System.out.println(fib(n,dp));
    }

    private static int fib(int n, int[] dp) {
        if(dp[n]==-1){
            dp[n]=fib(n-1,dp)+fib(n-2,dp);
        }
        return dp[n];
    }
}
