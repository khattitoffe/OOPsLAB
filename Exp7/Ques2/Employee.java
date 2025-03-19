package Exp7.Ques2;

public abstract class Employee{
    String name, role;
    double salary;
    
    Employee(String name,String role)
    {
        this.name=name;
        this.role=role;
        salary=0.0;
    }
    public abstract void calculateSalary();
    public abstract void displayDetails();
    
}