import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int arr[]={9,9};
        String s="";
        for(int i:arr){
            s=s+i;
        }
        int n=Integer.parseInt(s)+1;
        String res=n+"";
        int arrr[]=new int[res.length()];
        for(int i=0;i<res.length();i++){
            arrr[i]=res.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(arrr));
    }
}
