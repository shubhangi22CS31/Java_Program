 package shubhangijava;
import java.util.Scanner;

public class Calculate_Simple_Interest{ 
	public static void main(String[] args) {

		System.out.println("CALCULATE SIMPLE INTEREST");
		
		Scanner sc = new Scanner(System.in);
		float principal,rate,time;
	    float SI =0;
		System.out.println("Enter the required details:");
		System.out.print("Enter the principal amount->");
		principal= sc.nextFloat(); 
		System.out.print("Enter the interest rate->");
		rate = sc.nextFloat();
		System.out.print("Enter the time period-> ");	
		time = sc.nextFloat();
	    SI =(principal * rate * time) /100;
		System.out.print("The Simple Interest is :"+SI);
		sc.close();
	}
}


	