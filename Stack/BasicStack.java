package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of stack");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            st.push(a);
        }
        Stack<Integer> rt=new Stack<>();
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println("First:"+st);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println("Second:"+st);
        System.out.println(rt);
        System.out.println(gt);
    }
}
