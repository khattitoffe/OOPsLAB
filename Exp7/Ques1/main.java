package Exp7;
import java.util.*;

public class main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the length and breadth");
        Shape rectangle=new Rectangle(sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of Rectangle is : "+rectangle.calculateArea());
        
        System.out.println("Enter the radius of Circle");
        Shape circle=new Circle(sc.nextDouble());
        System.out.println("Area of Circle is : "+circle.calculateArea());
    }
}