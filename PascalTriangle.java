import java.sql.SQLOutput;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
               if(j==0 || j==i) {
                   System.out.print(1);
               }
               else{
                   System.out.print(2);
               }

            }
            System.out.println();
        }
//                [[1],
//                [1,1],
//                [1,2,1],
//                [1,3,3,1],
//                [1,4,6,4,1]]
    }
}
