import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num:arr){
            int n=list.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer> temp=new ArrayList<>(list.get(i));
                temp.add(num);
                list.add(temp);
            }
        }
        System.out.println(list);
    }
}
