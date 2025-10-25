package Stack;
import  java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int arr[]={1,3,2,1,8,6,3,4};

        for(int i=0;i<arr.length;i++){
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    max=arr[j];
                    break;
                }
            }
            st.push(max);
        }
        int arr1[]=new int[st.size()];
        int k=0;
        for(int i:st){
            arr1[k++]=i;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr1[j]=arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
