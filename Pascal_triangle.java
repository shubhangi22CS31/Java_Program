//PASCAL'S TRIANGLE
package shubhangijava;
import java.util.Scanner;
public class Pascal_triangle {
	public static void main(String[] args) {
		System.out.println("Printing a Pascal's triangle");
		System.out.print("Enter the number of lines in Pascal Triangle : ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int spaces =no;
		int number =1;
		for (int i=0;i<no;i++) {
			for (int j=1 ; j<= spaces; j++) {
				System.out.print(" ");
				
			}
			number = 1;
			for(int k=0;k<=i;k++) {
				System.out.print(number + " ");
				number = number*(i-k)/(k+1);
				
			}
			spaces--;
			System.out.println();
		}
		sc.close();
	}

}
