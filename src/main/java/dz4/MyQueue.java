package dz4;

import java.util.*;

public class MyQueue {
    private static LinkedList<String> queue;

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println(list);
        add("world",list); //добавить в конец
        System.out.println(remove(list)); //извлечь и вернуть первое в очереди
        System.out.println(top(list)); //посмотреть первое в очереди
        System.out.println(list);
    }

    private static void add(String mes,List<String> list) {
        list.add(0, mes);
    }

    private static String top(List<String> list) {
        return list.get(list.size()-1);
    }

    private static String remove(List<String> list) {
        String result = list.get(list.size()-1);
        list.remove(list.size()-1);
        return result;
    }
}
