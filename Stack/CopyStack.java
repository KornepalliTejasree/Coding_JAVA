package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of stack");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            st.push(a);
        }
        Stack<Integer>  st1=new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        Stack<Integer> st2=new Stack<>();
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        System.out.println(st2);
    }
}
