
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cap=sc.nextInt();
        int profits[]=new int[n+1];
        int weights[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            weights[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            profits[i]=sc.nextInt();
        }
        int dp[][]=new int[n+1][cap+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=cap;j++){
                int res=(j-weights[i])<0?0:profits[i]+dp[i-1][j-weights[i]];
                dp[i][j]=Math.max(res,dp[i-1][j]);
            }
        }
        System.out.println(dp[n][cap]);
    }
}