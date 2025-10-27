import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        ArrayList<Integer> arr1=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        int res[]=new int[arr.length];
        res[0]=-1;
        for(int i=1;i<arr.length;i++){
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
