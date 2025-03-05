//PROGRAM TO ADD TWO NUMBERS//
package shubhangijava;
import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		
		System.out.println("Enter the values for addition:");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int sum = a+b;
        System.out.print("addition of two numbers are : ");
     	System.out.println(sum);	
     	sc.close();
	}
	
}
