import java.util.*;
class Student
{
    String name;
    int age;
    Student()
    {
        name="";
        age=0;
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args)
    {
        Student obj= new Student();
        System.out.println("Displaying using default constructor");
        System.out.println("name : "+ obj.name);
        System.out.println("age : "+ obj.age);
        
        String user_name;
        int user_age;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter your Name");
        user_name=sc.nextLine();
        System.out.println("Enter you Age");
        user_age=sc.nextInt();
        
        Student obj1= new Student(user_name,user_age);
        System.out.println("Displaying using parameterized constructor");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }
}