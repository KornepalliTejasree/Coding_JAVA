package Stack;
import java.util.*;
public class StockAndSpan {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        Stack <Integer> stack2 = new Stack<>();
        int arr[]={100,80,60,70,60,75,85};

        stack.push(1);
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<i;j++){
               if(arr[j]<arr[i]){
                   continue;
               }
               else{
                stack.push(j-i);
                break;
               }
           }
        }
        System.out.println(stack);
    }
}
