import java.util.*;
class Exp2_Q1{
    double s1,s2,s3;
    public static void main(String[] args)
    {
       Exp2_Q1 obj=new Exp2_Q1();
       obj.input();
       obj.calc();
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for Subject 1");
        s1=sc.nextDouble();
        System.out.println("Enter marks for Subject 2");
        s2=sc.nextDouble();
        System.out.println("Enter marks for Subject 3");
        s3=sc.nextDouble();
    }
    void calc()
    {
        double average=(s1+s2+s3)/3.0;
        
        if(average>=90)
         System.out.println("Grade A");
        else if(average>=75)
         System.out.println("Grade B");
        else if(average>=50)
         System.out.println("Grade C");
        else
         System.out.println("Grade F");
    }
}