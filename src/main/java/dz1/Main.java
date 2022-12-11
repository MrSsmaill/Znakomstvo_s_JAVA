package dz1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        task1(5, 4);
//        task2(-1);
//        System.out.println(task3(0));
//        task4("Hello world",3);
//        System.out.println(task5(1795));
//        task6();
//        task7();
//        task8();
//        task9();
//        task10(5,2);
//        task11();
    }

    private static void task11() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            else {
                min = min<array[i]? min : array[i];
            }
        }
        System.out.printf("max = %s%nmin = %s",max,min);
    }

    private static void task10(int len,int initialValue) {
        int[] array = new  int[len];
        for (int i = 0; i < array.length; i++) {
            array[i]=initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task9() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || j == matrix.length-i-1) {
                    matrix[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void task8() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < 6 ? array[i] * 2 : array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task7() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task6() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(array));
        int num;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 1 ? 0 : 1;
        }
        System.out.println(Arrays.toString(array));
    }

    private static boolean task5(int GG) {
        int g1 = GG % 100;  //год в десятках
        int g3 = GG % 4;    //проверка на високосный
        int g4 = GG % 400;  //каждый 400 год високосный

        if (g1 == 0 & g4 != 0) return false;
        else {
            if (g4 == 0 || g3 == 0) return true;
            else return false;
        }
    }

    private static <string> void task4(string line, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(line);
        }
    }

    private static boolean task3(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void task2(int num) {
        if (num >= 0) {
            System.out.print("Положительное");
        } else {
            System.out.print("Отрицательное");
        }
    }

    private static void task1(int num1, int num2) {
        int sum = num1 + num2;
        if (sum >= 10 & sum <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
