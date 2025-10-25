import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindingSubString {
    public static boolean anagram(String sub, String target) {
        char[] arr = sub.toCharArray();
        char[] arr2 = target.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        return Arrays.equals(arr, arr2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String str = input.nextLine();
      String target = input.nextLine();
      String sub="";
        ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0; i < str.length(); i++){
          for(int j = i; j < str.length(); j++){
              for(int k = i; k <=j; k++){
                  sub = str.substring(i, j+1);

              }
              if(anagram(sub,target)){
                  list.add(i);
              }
          }
      }
      String s="abC";
      String b="ABc";
        System.out.println(s.equals(b));
        System.out.println(list);
    }

}
