package Exp8;
import java.io.*;

class Ques3{
    public static void main(String[] args)
    {
        readFile();
    }
    
    static void readFile() 
    {
       String filename="student.txt";
       int i;
       FileReader fr=null;
       try{
            fr=new FileReader(filename);
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File not Found");
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}