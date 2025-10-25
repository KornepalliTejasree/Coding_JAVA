
import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n){
        if(n==0 || n==1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of steps you want to climb:");
        int n=input.nextInt();
        System.out.println(climbStairs(n));
    }
}
