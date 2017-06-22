

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Inventory store1 = new Inventory("Store 1");
        System.out.println(store1.getName());
        store1.addNewProduct("Peanuts", 15.0, 5);
        store1.addInventory(1, 15);
        store1.addNewProduct("Almonds", 5);
        store1.addInventory(2, 5);
    }
}