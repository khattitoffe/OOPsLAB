package Exp6;
import java.util.*;
class mainQ4{
    public static void main(String[] args)
    {
         Logger obj= new  Logger();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a message");
         obj.logMessage(sc.nextLine());
    }
}