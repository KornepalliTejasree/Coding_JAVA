import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str1);
        HashMap<String,Integer> map=new HashMap<>();
        String str2[]=sb.toString().split(" ");
        for(String s:str2){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
