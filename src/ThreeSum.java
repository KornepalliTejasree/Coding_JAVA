import java.util.ArrayList;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            int sum=0;
            for(int j=0;j<=i;j++){
               sum+=arr[j];
               temp.add(arr[j]);



            }
            if(sum==0){
                list.add(new ArrayList<>(temp));
            }
        }
        System.out.println(list);
    }
}
