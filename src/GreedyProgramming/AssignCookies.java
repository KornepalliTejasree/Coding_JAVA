package GreedyProgramming;


import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int n[]={1,2,3};
        int m[]={1,1};
        int count=0;
      Arrays.sort(n);
      Arrays.sort(m);
        for(int i=0;i<n.length;i++){
            for(int j=0;j<m.length;j++){

                    if(n[i]==m[j]){
                        count++;
                    }

            }
        }

        System.out.println(count);
    }


}
