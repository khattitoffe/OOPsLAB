package Exp7.Ques3;
import java.util.*;

public class BankDemo{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Account obj=new Account();
        
        System.out.println("Enter the amount you want to deposit");
        obj.deposit(sc.nextDouble());
        System.out.println("Enter the amount you want to withraw");
        obj.withdraw(sc.nextDouble());
        
        System.out.println("Your Balance : "+obj.getBalance());
    }
}