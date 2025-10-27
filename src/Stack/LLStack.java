package Stack;

import java.sql.SQLOutput;

public class LLStack {
    public static class Node{
        int data;
        Node next;
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static class LLS{
        private Node head=null;
        private int size=0;
        void push(int data){
            Node temp=new Node(data,null);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            int value=head.data;
            head=head.next;
            return value;
        }
        int peek(){
            return head.data;
        }
        boolean isEmpty(){
            return head==null;
        }
        int size(){
            return size;
        }
        void revDisplay(Node h){
            if(h==null) return;
            revDisplay(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            revDisplay(head);
            System.out.println();
        }

    }
    public static void main(String[] args) {
     LLS stack = new LLS();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        //System.out.println(stack.isFull());
    }
}
