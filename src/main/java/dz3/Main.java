package dz3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ex1();
        System.out.println("#############################");
        ex2();
    }

    private static void ex2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 5, 6, 11, 3, 15, 7, 8);
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for (int em : list) {
            if (em > max) {
                max = em;
            }
            if (em < min) {
                min = em;
            }
            sum += em;
        }
        double average = sum / list.size();
        System.out.println(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }

    private static void ex1() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 5, 6, 11, 3, 15, 7, 8);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
