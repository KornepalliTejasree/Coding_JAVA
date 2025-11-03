package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicImple {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            int n=q.poll();
            q1.add(n);
            System.out.print(n+" ");
        }
    }
}
