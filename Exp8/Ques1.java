package Exp8;
import java.util.*;
import java.io.*;
class Ques1{
    
    public static void main(String[] args)
    {
        try{
            readFile();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not Found");
        }
        finally{
            System.out.println("File operation attempted");
        }
    }
    
    public static void readFile() throws FileNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File Name");
        String filename=sc.nextLine();
        
        File file=new File(filename);
        Scanner reader = new Scanner(file);
        System.out.println("File content:");

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }
}