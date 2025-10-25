package GreedyProgramming;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Greedy {
    public static void calculateProfit(float[] ProfitPerKg,int[] weights,int[] profits,int capacity){
        float amount=0.0f;
        for (int i=0;i<weights.length && capacity>0;i++){
            if(weights[i]<capacity){
                amount+=profits[i];
                capacity=capacity-weights[i];
            }
            else{
                amount=amount+(profits[i]/weights[i])*capacity;
                capacity=0;
            }
        }
        System.out.println("Profit: "+amount);
    }
    public static void sort(float[] ProfitPerKg,int[] weights,int[] profits) {
        for(int i=0;i<weights.length-1;i++) {
            for(int j=i+1;j<weights.length;j++) {
                if(ProfitPerKg[i]<ProfitPerKg[j]) {
                    swap(ProfitPerKg,i,j);
                    swapInt(weights,i,j);
                    swapInt(profits,i,j);
                }
            }

        }
    }

    private static void swapInt(int[] profits, int i, int j) {
        int temp = profits[i];
        profits[i] = profits[j];
        profits[j] = temp;
    }

    private static void swap(float[] ProfittPerKg, int i, int j) {
        float w=ProfittPerKg[i];
        ProfittPerKg[i]=ProfittPerKg[j];
        ProfittPerKg[j]=w;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size");
        int n=input.nextInt();
        int profits[]=new int[n];
        int weights[]=new int[n];
        System.out.println("Enter profits:");
        for(int i=0;i<n;i++){
            profits[i]=input.nextInt();
        }
        System.out.println("Enter weights");
        for(int i=0;i<n;i++){
            weights[i]=input.nextInt();
        }
        float ProfittPerKg[]=new float[n];
        for(int i=0;i<n;i++){
            ProfittPerKg[i]=(float)profits[i]/weights[i];
        }

       sort(ProfittPerKg,weights,profits);
        System.out.println("Enter capacity:");
        int capacity=input.nextInt();
        calculateProfit(ProfittPerKg,weights,profits,capacity);
    }
}
