package Exp9;

import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> inventory = new HashMap<>();

        inventory.put(1001, 50);  
        inventory.put(1002, 30);  
        inventory.put(1003, 20);   
        System.out.println("Inventory Before:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
        
        inventory.put(1002, 40);  
        inventory.remove(1001);

        System.out.println("Final Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
