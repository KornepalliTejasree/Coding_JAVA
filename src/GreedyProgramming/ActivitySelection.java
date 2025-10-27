package GreedyProgramming;

import java.util.Scanner;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
            end[i]=sc.nextInt();
        }
        sort(start,end);
        int tasks=1,endIndx=0;
        for(int i=1;i<n;i++){
            if(end[endIndx]<=start[i]){
                tasks++;
                endIndx=i;
            }
        }
        System.out.println(tasks);
    }

    private static void sort(int[] start, int[] end) {
        for(int i=0;i<end.length-1;i++){
            for(int j=i+1;j<end.length;j++){
                if(end[i]>end[j]){
                    swap(end,i,j);
                    swap(start,i,j);
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
