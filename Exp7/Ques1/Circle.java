package Exp7;
import java.util.*;
class Circle extends Shape{
    double radius;
    Circle(double radius)
    {
        this.radius=radius;
    }
    
    @Override
    public double calculateArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
}