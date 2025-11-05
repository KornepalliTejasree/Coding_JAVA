package Recursion;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=input.nextInt();
        System.out.println("Enter the element you want to search");
        int search = input.nextInt();
       if(isFind(search,0,arr)) {
           System.out.println("Target found");
       }
       else{
           System.out.println("Target not found");
       }
        System.out.println(findIndex(search,0,arr));
    }

    private static boolean isFind(int search,int i,int arr[]) {
        if(arr[i]==search) return true;
        if(i==arr.length-1) return false;
        return isFind(search,i+1,arr);
    }
//    private static boolean isFind(int search,int i,int arr[]) {
//
//        if(i==arr.length) return false;
//        return arr[i]==search || isFind(search,i+1,arr);
//    }
    private static int findIndex(int search,int i,int arr[]) {
        if (i==arr.length)return -1;
        return arr[i]==search?i:findIndex(search,i+1,arr);
    }
}
