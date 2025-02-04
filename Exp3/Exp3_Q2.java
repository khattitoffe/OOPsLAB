import java.util.*;
public class Exp3_Q2 {
   
    int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int newSize = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize++] = arr[i];
            }
        }

        int[] uniqueArray = Arrays.copyOf(temp, newSize);

        Arrays.sort(uniqueArray);
        return uniqueArray;
    }
    
    public static void main(String[] args) {
        Exp3_Q2 obj=new Exp3_Q2();
        int[] arr;
        
        arr=obj.input();
        int[] result=obj.removeDuplicates(arr);
        obj.printArray(result);
    }
    
    int[] input()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        
        System.out.println("Enter Elements into the array");
        
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    
    void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}