package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementStack {
    public static void main(String[] args) {
        int arr[]={1,5,3,2,1,6,3,4};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        int res[]=new int[n];
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
