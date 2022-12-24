package dz4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();

    }

    private static void ex2() {

    }

    private static void ex1() {
        int elem = 10000;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < elem; i++) {
            list1.add(0,i);
        }
        long start1 = System.currentTimeMillis();
        System.out.println(listFlip(list1));
        System.out.printf("ArrayList %s",System.currentTimeMillis()-start1);
        System.out.println();


        LinkedList<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < elem; i++) {
            list2.add(0,i);
        }
        long start2 = System.currentTimeMillis();
        System.out.println(listFlip(list2));
        System.out.printf("LinkedList %s",System.currentTimeMillis()-start2);



    }

    private static List<Integer> listFlip(List<Integer> list) {
        Integer el;
        for (int i = 0; i < list.size()/2; i++) {
            el = list.get(i);
            list.set(list.get(i),list.get(list.size()-1-i));
            list.set(list.get(list.size()-1-i),el);
        }
        return list;
    }
}
