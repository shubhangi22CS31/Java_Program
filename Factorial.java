//TO FIND THE FACTORIAL OF A NUMBER//
package shubhangijava;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		
		System.out.print("Enter the number whose factorial to be done : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact=1;
		while(num>0)
		{
			fact = fact*num;
			num=num-1;
		}
		if (num<0) {
			System.out.println("Factorial not define for negative number 🤦‍♀️ !!! #try again#...");
		}else {
			System.out.print("The factorial of the given number is : ");
			System.out.println(fact);
			}
		System.out.print("thank you (^///^) ");
	sc.close();
}
}
