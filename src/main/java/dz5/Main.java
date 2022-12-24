package dz5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> directory = new HashMap<>();
        add(directory);
        add(directory);
        add(directory);
        add(directory);
        System.out.println(directory);
    }

    private static void add(Map<String, ArrayList<String>> directory) {
        System.out.println("Введите Имя");
        String userName = new Scanner(System.in).nextLine().strip();
        System.out.println("Введите номер");
        String userPhone = new Scanner(System.in).nextLine();
        if (directory.containsKey(userName)){
            directory.get(userName).add(userPhone);
        }else {
            ArrayList<String> array = new ArrayList<String>();
            array.add(userPhone);
            directory.put(userName,array);
        }
    }
}
