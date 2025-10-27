import java.util.ArrayList;
import java.util.Arrays;

public class StockSpanProblem {
    public static void main(String[] args) {
        int arr[]={100, 80, 90, 120,90};
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<=i;j++){
                if(arr[j]<=arr[i]){
                    count++;
                }
            }
            arr1.add(count);
        }
        for(int j=0;j<arr.length;j++){
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]==arr[j]){
                    arr1.set(i,arr1.get(j));
                }
            }
        }
        System.out.println(arr1);
    }
}
