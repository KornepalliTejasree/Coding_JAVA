package Recursion;

import java.util.Arrays;
import java.util.Scanner;

class Nqueens {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
      Arrays.fill(board[i],'.');
    }
    find(n,board,0);
  }
  public static void find(int n,char[][] board,int j){
      if(j==n){
          printArray(board);
          System.out.println();
          return;
      }
     for(int i=0;i<n;i++){
         if(check(n,board,i,j)){
             board[i][j]='Q';
             find(n,board,j+1);
             board[i][j]='.';
         }
     }

  }

    private static boolean check(int n,char[][] board, int i, int j) {
      for(int k=n-1;k>=0;k--){
          if(board[i][k]=='Q'){
              return false;
          }
      }
      for(int k=1;(i+k<n) && (j-k>=0);k++){
          if(board[i+k][j-k]=='Q'){
              return false;
          }
      }
        for(int k=1;(i-k>=0) && (j-k>=0);k++){
            if(board[i-k][j-k]=='Q'){
                return false;
            }
        }
        return true;
    }

    private static void printArray(char[][] board) {
      for(int i=0;i<board.length;i++){
          System.out.println(new String(board[i]));
      }
    }
}