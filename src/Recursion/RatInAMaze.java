package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class RatInAMaze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maze[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maze[i][j]=sc.nextInt();
            }
        }
        ArrayList<String> list=new ArrayList<>();
        findpaths(n,maze,list);
        System.out.println(list);
    }

    private static void findpaths(int n, int[][] maze, ArrayList<String> list) {
        findpaths(n,maze,list,0,0,"");
    }
    private static void findpaths(int n, int[][] maze, ArrayList<String> list,int i,int j,String path){
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0){
            return;
        }
        if(i==n-1 && j==n-1){
            list.add(path);
        }
        maze[i][j]=0;
        findpaths(n,maze,list,i+1,j,path+"D");
        findpaths(n,maze,list,i,j-1,path+"L");
        findpaths(n,maze,list,i-1,j,path+"U");
        findpaths(n,maze,list,i,j+1,path+"R");
        maze[i][j]=1;
    }
}
