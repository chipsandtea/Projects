

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Inventory store1 = new Inventory("Store 1");
        System.out.println(store1.getName());
        store1.addProduct("Peanuts", 15.0, 5);
    }
}