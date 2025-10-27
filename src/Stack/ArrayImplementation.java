package Stack;



public class ArrayImplementation {
    public static class Stack{
        int[] arr=new int[10];
        int indx=0;
        void push(int x){
            arr[indx++]=x;
        }
        void pop(){
            if(indx==0) {
                System.out.println("Stack is empty");
                return;
            }
            else{
                arr[--indx]=0;
            }
        }
        void peek(){
            if(indx==0) {
                System.out.println("Stack is empty");
                return;
            }
            else{
                System.out.println(arr[indx]);
            }
        }
        void display(){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return arr.length;
        }
        boolean isEmpty(){
            return indx==0;
        }
        boolean isFull(){
            return indx==arr.length;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        //stack.peek();
        //stack.size();
        //System.out.println(stack.isEmpty());
        //System.out.println(stack.isFull());

    }
}
