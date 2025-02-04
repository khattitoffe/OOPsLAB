import java.util.*;
class Exp3_Q1
{//find second largest element in array
    int arr[];
    static Exp3_Q1 obj=new Exp3_Q1();
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter the length of array");
        obj.input(sc.nextInt());
        
        int secondLargest=obj.findSecondLargest();
        System.out.println("Second Largest Element : "+ secondLargest);
    }
    
    void input(int len)
    {
        arr=new int[len];
        
        System.out.println("Enter the element");
        for(int i=0;i<len;i++)
          arr[i]=sc.nextInt(); 
    }
    
    int findSecondLargest()
    {
        
        if(arr.length<=1)
          return -1;
        int largest=0,secondLargest=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
              { 
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest)
              {
                secondLargest=arr[i];  
            }
        }
        
        return secondLargest;
    }
}