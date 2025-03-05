package shubhangijava;
import java.util.Scanner;
public class Array_Rotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        rotateLeft(arr, d);

        System.out.println("Array after " + d + " left rotations:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

   public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;

        d = d % n;  
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
   
   }
   
}

		
