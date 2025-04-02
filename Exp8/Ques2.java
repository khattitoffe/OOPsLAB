package Exp8;
import java.util.*;
import java.io.*;

class Ques2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        System.out.println("Enter Student Roll No");
        String rollNo=sc.nextLine();
        System.out.println("Enter Student Grade");
        String grade=sc.nextLine();
        
        writeContent(name,rollNo,grade);
        sc.close();
    }
    
    static void writeContent(String name,String rollNo,String grade)
    {
        String content="\n Name : "+name+" Roll No : "+rollNo+" Grade : "+grade;
        FileWriter writer=null;
        try{
           writer=new FileWriter("student.txt",true);
            writer.write(content);
            System.out.println("Data Written");
         }
         catch(Exception e)
         {
             System.out.println("Error While Writting to File");
         }
         finally{
             try
             {
                 writer.close();
             }
             catch (IOException ioe)
             {
                 System.out.println("Could not close writer");
             }
         }
    }
}