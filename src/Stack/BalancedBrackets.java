package Stack;

import java.util.Arrays;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        String s="())(";
        int charsToBedeleted=0;
        boolean flag=true;
        char c[]=s.toCharArray();
        int i=0;
        int n=c.length;
        while(n>0){
           if(c[i]=='('){
               stack.push('(');
               i++;
           }
           else{
               if(stack.size()==0){
                  flag=false;
                  break;
               }
               if(stack.peek()=='('){
                   stack.pop();
                   charsToBedeleted+=2;
               }
               i++;
           }
            n--;
        }
        if (!stack.isEmpty()) {
            flag = false;
        }
        int finalAns=s.length()-charsToBedeleted;
        if(flag==false){
            System.out.println(finalAns);
        }
        else{
            System.out.println(0);
        }
        System.out.println(flag);
    }
}
