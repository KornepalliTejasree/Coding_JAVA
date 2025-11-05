import java.util.*;

public class LongestSubSequenceString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1=sc.nextLine();
        Set<String> list=new HashSet<>();
        Set<String> list1=new HashSet<>();
      for(int i=0;i<s.length();i++){
          for(int j=i+1;j<s.length();j++){
              String res=s.charAt(i)+""+s.charAt(j);
              list.add(res);
          }
          break;
      }
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                String res=s1.charAt(i)+""+s1.charAt(j);
                list1.add(res);
            }
            break;
        }
        ArrayList<String> list2=new ArrayList<>(list);
        ArrayList<String> list3=new ArrayList<>(list1);
        int n=0;
        for(int i=0;i<list.size();i++){
            if(list1.contains(list2.get(i))){
                System.out.println(list2.get(i));
                n=Math.max(n,list2.get(i).length());
            }
        }


        System.out.println(n);
    }
}
