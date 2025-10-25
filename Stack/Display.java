package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Display {
    //Using recursion
    public static void display(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top=stack.pop();
        display(stack);
        System.out.print(top+" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack stack = new Stack();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        //Using array
//        int arr[]=new int[n];
//        while (!stack.isEmpty()) {
//            arr[n-1]= (int) stack.pop();
//            n--;
//        }
//        System.out.println("Using Array:"+Arrays.toString(arr));
        //Without using array
        display(stack);
        Stack stack2 = new Stack();
        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop()+" ");
        }

    }
}
