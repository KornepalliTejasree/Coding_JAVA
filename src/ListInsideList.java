import java.util.ArrayList;
import java.util.Scanner;

public class ListInsideList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
      for(int i=0;i<rows;i++){
        list.add(new ArrayList<>());
          for(int j=0;j<cols;j++){
           list.get(i).add(sc.nextInt());
          }
      }
      for(int i=0;i<rows;i++){
          int sum=0;
          for(int j=0;j<cols;j++){
              sum+=list.get(i).get(j);
          }
          System.out.println("Row "+(i+1)+": "+sum);
      }


    }
}
