//TO PRINT THE PATTERN

package shubhangijava;
import java.util.Scanner;
public class Pattern_print {
	public static void main(String[]args) {
		System.out.println("The pattern");
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the length of for the pattern : ");
		n=sc.nextInt();
		for (int i=1 ; i<=n; i++) {
			int p=1;
			for (int j=1; j<=n-i;j++) {
				System.out.print(" ");
				
			}
			for (int j=1; j<i;j++) {
				System.out.print(p++ +" ");
				
			}
			for (int j=1; j<=i;j++) {
				System.out.print(p-- +" ");
				
			}
			
			System.out.println();
			
		}
		sc.close();
	}

	}

