import java.util.ArrayList;

public class SwapUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(100);
        arr1.add(20);
        arr1.add(350);
        arr1.add(40);
        arr1.add(560);
        swap(arr1,3,1);
        System.out.println(arr1);
    }
    public static void swap(ArrayList<Integer> arr,int i,int j){
        int temp=arr.get(i);
       arr.set(i,arr.get(j));
       arr.set(j,temp);
    }
}
