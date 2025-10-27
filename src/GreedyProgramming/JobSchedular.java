package GreedyProgramming;

import java.util.Scanner;



public class JobSchedular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int profits[]=new int[n];
        int deadlines[]=new int[n];
        for(int i=0;i<n;i++){
            input.next();
            deadlines[i]=input.nextInt();
            profits[i]=input.nextInt();
        }
       int profit= calculateProfit(deadlines,profits);
        System.out.println(profit);
    }

    private static int calculateProfit(int[] deadlines, int[] profits) {
        int deadline=0,profit=0,tasks=0;
        for(int i=0;i<deadlines.length;i++){
            deadline=Math.max(deadline,deadlines[i]);
        }
        sort(deadlines,profits);
        boolean[] visited=new boolean[deadline+1];
        for(int i=0;i<deadlines.length;i++){
            int k=deadlines[i];
            while(k>0){
                if(visited[k]==false){
                    tasks++;
                    profit+=profits[i];
                    visited[k]=true;
                    break;
                }
                k--;
            }
        }
        System.out.print(tasks);
        return profit;
    }

    private static void sort(int[] deadlines, int[] profits) {
        for(int i=0;i<profits.length-1;i++){
            for(int j=i+1;j<profits.length;j++){
                if(profits[i]<profits[j]){
                    swap(deadlines,i,j);
                    swap(profits,i,j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
