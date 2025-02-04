import java.util.Scanner;

public class Exp3_Q3 {
    
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
      }
    
    
    static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 

        reverse(arr, 0, n - 1);   
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    
    static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of K (number of rotations):");
        int k = sc.nextInt();
        
        sc.close();
        rotateRight(arr, k);
        return arr;
    }
    
    static void printArray(int[] arr) {
        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] rotatedArray = inputArray();
        printArray(rotatedArray);
    }
}