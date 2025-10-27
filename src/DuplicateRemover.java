import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateRemover {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,5};
        HashSet<Integer> arr1=new HashSet<>();
        ArrayList<Integer> l=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           boolean isprs=false;
       for(int j=i+1;j<arr.length;j++){
           if(arr[i]==arr[j]){
               isprs=true;
           }
       }
       if(isprs){
           l.add(arr[i]);
       }

       }

       for(int i:arr){
           if(!arr1.contains(i)){
               l.add(i);
           }
       }
        System.out.println(l);
    }
}
