package Strings;
import java.util.*;
public class RemovingAnagrams {
    public static boolean isAnagram(String s1,String s2){
        char c[]=s1.toCharArray();
        char ch[]=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        String s=String.valueOf(c);
        String s3=String.valueOf(ch);
        return s.equals(s3);
    }
    public static void main(String[] args) {
        String s[]={"a","b","c","d","e"};
      LinkedHashSet<String> h=new LinkedHashSet<>();
        for(int i=0;i<s.length-1;i++){
          for(int j=i+1;j<s.length;j++){
              if(isAnagram(s[i],s[j])){
                  if(i<j){
                      h.add(s[i]);
                      s[j]="";
                  }
              }
              else{
                  h.add(s[i]);
              }
          }
        }
        ArrayList<String> list=new ArrayList<>();
        for(String i:h){
            if(i.length()>0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
