import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++) {
            coins[i] = sc.nextInt();
        }
        int balance=sc.nextInt();
        Arrays.sort(coins);
        int dp[]=new int[balance+1];
        Arrays.fill(dp,balance+1);
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=balance;j++){
                dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        int res=dp[balance]==balance+1?-1:dp[balance];
        System.out.println(res);
    }
}
