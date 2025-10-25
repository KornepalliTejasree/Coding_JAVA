import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx1 {
    public static void main(String[] args) {
        int arr[]={1,0};
        int arr1[]={1};
        int m=1,n=1;
        //1,2,2,3,3,5
        ArrayList<Integer> l=new ArrayList<>();
        int i;
       for(i=0;i<arr.length-m;i++){
           l.add(arr[i]);
       }
       for(int j=0;j<n;j++){
           l.add(arr1[j]);
       }
       Collections.sort(l);
       System.out.println(l);
    }
}
