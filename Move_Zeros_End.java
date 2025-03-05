package shubhangijava;
import java.util.Scanner;
import java.util.Arrays;
public class Move_Zeros_End {
	    public static void moveZerosToEnd(int[] arr) {
	        int index = 0; 
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[index] = arr[i];
	                if (index != i) {  
	                    arr[i] = 0;
	                }
	                index++;
	            }
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("enter the size of array:");
	    	int b = sc.nextInt();
	    	int [] arr = new int[b];
	    	System.out.println("enter the elements of array:");
	    	for (int i = 0; i < b; i++) {
	            arr[i] = sc.nextInt();
	    	}
	        
	        System.out.println("Original array:");
	        printArray(arr);
	        
	        moveZerosToEnd(arr);
	        
	        System.out.println("Array after moving zeros to the end:");
	        printArray(arr);
	        sc.close();

	    }
	}

	