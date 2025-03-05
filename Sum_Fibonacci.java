//Sum of Fibonacci sequence
package shubhangijava;

import java.util.Scanner;
public class Sum_Fibonacci {
	public static void main(String[] args) {
		System.out.println("PRINTING THE SUM OF FIBONACCI SERIES");
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the upper limit for the sum of fibonacci series : ");
		int n=sc.nextInt();
		a=0;
		b=1;
		int sum =1;
		System.out.print(a+" "+b+" ");

		for(;(a+b)<n;) {
			c=a+b;
			System.out.print(c+" ");
			sum =sum+c;
			a=b;
			b=c;
		}
		System.out.println("sum = "+sum);
	sc.close();
	
	}

}
