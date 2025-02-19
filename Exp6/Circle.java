package Exp6;
import java.util.*;
class Circle extends MathConstants{
    void calculateArea(double radius){
        double area=PI*radius*radius;
        System.out.println("Area of Circle "+ area);
        
    }
    
    public static void main(String[] args)
    {
        Circle obj=new Circle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        
        obj.calculateArea(sc.nextDouble());
    }
    
    void displayPI()
    {
        PI=4;//we cannot change the value of a final variable
        System.out.println("Value of PI = "+ PI);
        //we cannot override a final variable
    }
}