package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        System.out.println("Enter Index:");
        int index=sc.nextInt();
        System.out.println("Enter Value:");
        int value=sc.nextInt();
        //Insertion at particular index
        Stack temp=new Stack();
        while(s.size()>index){
            temp.push(s.pop());
        }
        s.push(value);
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        System.out.println(s);
        //Insertion at particular position
        System.out.println("Enter position:");
        int position=sc.nextInt();
        System.out.println("Enter Value:");
        int value1=sc.nextInt();
        while(s.size()>position){
            temp.push(s.pop());
        }
        s.push(value1);
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        System.out.println(s);
    }
}
