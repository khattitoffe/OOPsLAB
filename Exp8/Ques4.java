package Exp8;
import java.util.Scanner;
import java.io.*;

public class Ques4{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String filename = scanner.nextLine();
        
        count(filename);
    }
    
    static void count(String filename)
    {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }
        
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            
            int charCount = 0;
            int wordCount = 0;
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                charCount += line.replaceAll("\\s", "").length(); // Count non-whitespace characters
                wordCount += line.trim().isEmpty() ? 0 : line.trim().split("\\s+").length; // Count words
            }
            
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}