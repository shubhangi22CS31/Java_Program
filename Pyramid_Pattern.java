//TO PRINT PYRAMID PATTERN
package shubhangijava;
import java.util.Scanner;
public class Pyramid_Pattern {
	public static void main(String[] args) {
		System.out.println("The pyramid pattern");
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the length of pyramid : ");
		n=sc.nextInt();
		for (int i=1 ; i<=n; i++) {
			for (int j=1; j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for (int k=1; k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
