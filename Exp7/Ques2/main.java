package Exp7.Ques2;
import java.util.*;
public class main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name, role,fixedSalary");
        Employee obj=new Manager(sc.nextLine(),sc.nextLine(),sc.nextDouble());
        obj.calculateSalary();
        obj.displayDetails();
        
        System.out.println("Enter name, role,Hourly Salary and WorkHour");
        Employee obj1=new Developer(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextInt());
        obj1.calculateSalary();
        obj1.displayDetails();
    }
}