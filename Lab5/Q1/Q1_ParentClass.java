package Exp5;
import java.util.*;
class Q1_ParentClass{
    private String className="Q1_ParentClass";
    
    public static void main(String[] args)
    {
        Q1_ParentClass obj=new Q1_ParentClass();
        obj.display();
    }
    public void display()
    {
        System.out.println("className = "+className);
    }
}
