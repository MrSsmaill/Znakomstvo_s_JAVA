package dz4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyStack {
    private static LinkedList<String> stack;

    public static void main(String[] args) {
        List<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        push(wordsList,"hello"); //добавить в конец
        System.out.println(pop(wordsList)); //посмотреть и извлечь последнее в стеке
        System.out.println(peek(wordsList)); //посмотреть последнее в стеке
        System.out.println(wordsList);
    }

    private static void push(List<String> list,String hello) {
        list.add(hello);
    }

    private static String peek(List<String> list) {
        return list.get(list.size()-1);
    }

    private static String pop(List<String> list) {
        String result = list.get(list.size()-1);
        list.remove(list.size()-1);
        return result;
    }
}
