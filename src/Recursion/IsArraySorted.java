package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
     if(isSorted(arr,0)){
         System.out.println("Yes!! the array is sorted");
     }
     else{
         System.out.println("No!! the array is not sorted");
     }
    }

    private static boolean isSorted(int[] arr,int i) {
        if(i== arr.length-1) return true;
        return arr[i]<=arr[i+1] &&  isSorted(arr,i+1);
    }
}
