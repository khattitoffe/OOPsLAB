package Exp9;
import java.util.*;
class Ques4{
    public static void main(String[] args) {
       
        String[] names = {"Aman", "Karan", "Nischal", "Karan", "Aman"};

        
        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        String nameToCheck = "Sourabh";
        if (uniqueNames.contains(nameToCheck)) {
            System.out.println(nameToCheck + " is in the set.");
        } else {
            System.out.println(nameToCheck + " is not in the set.");
        }

        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}