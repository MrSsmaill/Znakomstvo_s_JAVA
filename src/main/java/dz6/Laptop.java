package dz6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laptop {
    String name;
    Integer vendorCode;
    String operatingSystem;
    Integer ram;
    Double screenDiagonal;
    String colour;
    Integer memorySize;


    @Override
    public String toString() {
        return String.format("name: %s, OS: %s, ram: %d, screen: %.1f, colour: %s, memory: %d%n",name,operatingSystem,ram,screenDiagonal,colour,memorySize);
    }

}
