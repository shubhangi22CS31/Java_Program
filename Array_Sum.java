
package shubhangijava;
import java.util.Scanner;
public class Array_Sum {
	public static void main(String[]agrs) {
		System.out.println("to print the array sum");
		Scanner sc= new Scanner(System.in);
		System.out.print("Entre the number of element in array:");
		int n= sc.nextInt();
		int[] arr = new int[n];
	
		for (int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the element of array are");
		for (int i=0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		int sum =0;
		for (int i=0; i<n; i++) {
			sum +=arr[i];
		}
		System.out.println("\nThe sum of the elements in the array is :"+sum);
		sc.close();
		
	}

}
