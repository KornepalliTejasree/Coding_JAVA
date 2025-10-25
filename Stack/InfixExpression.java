package Stack;

import java.util.Stack;

public class InfixExpression {
    public static void main(String[] args) {
        String s="9-(5+3)*4/6";
        Stack<Integer> stack=new Stack<>();
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else if(stack1.size()==0 || ch=='(' || stack1.peek()=='('){
                stack1.push(ch);
            }
            else if(ch==')'){
               while(stack1.peek()!='(') {
                   int val2=stack.pop();
                   int val1=stack.pop();
                   if(stack1.peek()=='+')stack.push(val1+val2);
                   if(stack1.peek()=='-')stack.push(val1-val2);
                   if(stack1.peek()=='*')stack.push(val1*val2);
                   if(stack1.peek()=='/')stack.push(val1/val2);
                   stack1.pop();
               }
                stack1.pop();
            }
            else{
                if(ch=='+'||ch=='-'){
                    int val2=stack.pop();
                    int val1=stack.pop();
                    if(stack1.peek()=='+')stack.push(val1+val2);
                    if(stack1.peek()=='-')stack.push(val1-val2);
                    if(stack1.peek()=='*')stack.push(val1*val2);
                    if(stack1.peek()=='/')stack.push(val1/val2);
                    stack1.pop();
                    stack1.push(ch);
                }
                if(ch=='*' ||  ch=='/'){
                    if(stack1.peek()=='*' || stack1.peek()=='/'){
                        int val2=stack.pop();
                        int val1=stack.pop();
                        if(stack1.peek()=='*')stack.push(val1*val2);
                        if(stack1.peek()=='/')stack.push(val1/val2);
                        stack1.pop();
                        stack1.push(ch);
                    }
                    else{
                        stack1.push(ch);
                    }
                }

            }
        }
        while(stack.size()>1){
            int val2=stack.pop();
            int val1=stack.pop();
            if(stack1.peek()=='+')stack.push(val1+val2);
            if(stack1.peek()=='-')stack.push(val1-val2);
            if(stack1.peek()=='*')stack.push(val1*val2);
            if(stack1.peek()=='/')stack.push(val1/val2);
            stack1.pop();
        }
        System.out.println(stack.peek());
    }
}
