package dz2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
//        System.out.println(palinom("aacbcaaa"));
//        writerData(lines100());
    }

    private static void writerData(String line) {
        try(PrintWriter pw = new PrintWriter("src/main/resources/files/lines_100.txt")) {
            pw.print(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not fount: " + e.getMessage());
        }
    }

    private static String lines100() {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        return sb.toString();
    }

    private static Boolean palinom(String line) {
        if (line.isBlank()) {
            System.out.println("Строки нет");
        }
        int count = line.length() - 1;

        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(count)) {
                return false;
            } else {
                count--;
            }
        }
        return true;
    }
}
