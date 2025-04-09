package Exp9;
import java.util.*;

class Ques1{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList=new ArrayList<>();
        
        myList.add(83);
        myList.add(16);
        myList.add(-921);
        myList.add(743);
        myList.add(41);
        myList.add(0);
        myList.add(57);
        
        System.out.println("ArrayList : "+ myList);
        System.out.println("Checking for prime number");
        
        for(int num:myList)
        {
            if(checkPrime(num))
            {
                System.out.println(num+" is Prime");
            }
            else{
                System.out.println(num+" is not Prime");
            }
        }
    }
    
    
    public static boolean checkPrime(int num)
    {
        if(num<=1)
         return false;
        if(num==2)
         return true;
        if(num%2==0)
         return false;
        
        for(int i=3;i<num/2;i++)
        {
            if(num%i==0)
             return false;
        }
        return true;
    }
}