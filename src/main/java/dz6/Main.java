package dz6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.name = "Apple MacBook Pro 13";
        l1.vendorCode = 17323;
        l1.operatingSystem = "Mac OS";
        l1.ram = 8;
        l1.screenDiagonal = 13.3;
        l1.colour = "Space Gray";
        l1.memorySize = 256;

        Laptop l2 = new Laptop();
        l2.name = "ASUS Vivobook 15";
        l2.vendorCode = 34223;
        l2.operatingSystem = "No OS";
        l2.ram = 16;
        l2.screenDiagonal = 15.6;
        l2.colour = "Blue";
        l2.memorySize = 512;

        Laptop l3 = new Laptop();
        l3.name = "Apple MacBook Pro 16";
        l3.vendorCode = 16367;
        l3.operatingSystem = "Mac OS";
        l3.ram = 64;
        l3.screenDiagonal = 16.2;
        l3.colour = "Silver";
        l3.memorySize = 8129;

        Laptop l4 = new Laptop();
        l4.name = "HP 250 G8";
        l4.vendorCode = 12355;
        l4.operatingSystem = "Free DOS 3.0";
        l4.ram = 8;
        l4.screenDiagonal = 15.6;
        l4.colour = "Silver";
        l4.memorySize = 512;

        ArrayList<Laptop> notebook = new ArrayList<Laptop>(Arrays.asList(l1,l2,l3,l4));
        System.out.println(notebook);

        System.out.println("Введите параметр сортировки ");
        Scanner scanner = new Scanner(System.in);
        var parameter = scanner.nextLine();
        System.out.println("Введите значение ");
        var value = scanner.nextLine();

        ArrayList<Laptop> result = new ArrayList<>();
        for (Laptop em:notebook) {
            if (Objects.equals(parameter, "name")) {
                if (Objects.equals(value, em.name)){
                    result.add(em);
                }
            } else if (Objects.equals(parameter, "code")) {
                if (new String(String.valueOf(em.vendorCode)).equals(value)){
                    result.add(em);
                }
            } else if (Objects.equals(parameter, "OS")) {
                if (Objects.equals(value, em.operatingSystem)){
                    result.add(em);
                }
            } else if (Objects.equals(parameter, "ram")) {
                if (new String(String.valueOf(em.ram)).equals(value)){
                    result.add(em);
                }
            } else if (Objects.equals(parameter, "screen")) {
                if (new String(String.valueOf(em.screenDiagonal)).equals(value)){
                    result.add(em);
                }
            } else if (Objects.equals(parameter, "colour")) {
                if (Objects.equals(value, em.colour)){
                    result.add(em);
                }
            } else if (Objects.equals(parameter, "memory")) {
                if (new String(String.valueOf(em.memorySize)).equals(value)){
                    result.add(em);
                }
            } else {
                System.out.println("Вы ввели не верное значение");
            }
        }
        System.out.println(result);
    }

    private static void values(Objects param, String value) {
    }
}
