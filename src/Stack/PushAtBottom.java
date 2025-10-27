package Stack;

import java.util.Stack;

public class PushAtBottom {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        pushAtBottom(stack);
        System.out.println(stack);
    }

    private static void pushAtBottom(Stack stack) {
      Stack temp = new Stack();
      while (!stack.isEmpty() ){
        temp.push(stack.pop());
      }
      stack.push(0);
      while (!temp.isEmpty()) {
          stack.push(temp.pop());
      }
    }
}
