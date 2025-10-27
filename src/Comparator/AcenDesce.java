package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AcenDesce {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(8);
        arr.add(3);
        arr.add(20);
        arr.add(4);
        arr.add(30);
        arr.add(5);
        arr.add(6);
        ArrayList<Integer> ascending=new ArrayList<>(arr);
        Collections.sort(arr,(a,b)-> a.compareTo(b));
        System.out.println(arr);
        ArrayList<Integer> descending=new ArrayList<>(arr);
        Collections.sort(arr,(a,b)-> b.compareTo(a));
        System.out.println(arr);
    }
}
