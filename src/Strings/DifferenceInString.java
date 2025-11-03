package Strings;

import java.util.*;


public class DifferenceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        boolean res=differenceInString(first, second);
        System.out.println(res);
    }

    private static boolean differenceInString(String first,String second) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:first.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char i:second.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
      HashSet<Character> set=new HashSet<>();
        for(char i:first.toCharArray()){
            if(second.indexOf(i)!=-1){
               set.add(i);
            }
        }
        for(char i:second.toCharArray()){
            if(first.indexOf(i)!=-1){
                set.add(i);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(!set.contains(entry.getKey())){
                list.add(entry.getValue());
            }
        }
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            if(!set.contains(entry.getKey())){
                list.add(entry.getValue());
            }
        }
       for(int i:list){
           if(i>=4){
               return false;
           }
       }
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           for(Map.Entry<Character,Integer> entry1:map1.entrySet()){
               if(set.contains(entry.getKey()) && set.contains(entry1.getKey()) && entry.getKey()==entry1.getKey()){
                   int n=Math.abs(entry.getValue()-entry1.getValue());
                   if(n>=4){
                       return false;
                   }
               }
           }
       }

       return true;
    }
}
