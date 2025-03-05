package shubhangijava;
import java.util.Scanner;
public class Sum_Of_Diagonal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the matrix (nxn):");
		int n= sc.nextInt();
		int[][] matrix = new int[n][n];
		
		System.out.println("enter the element of matrix:");
		for (int i=0;i<n; i++) {
			for (int j=0;j<n;j++) {
				matrix[i][j] =sc.nextInt();
			}
		}
		System.out.println("matrix:");
		displayMatrix(matrix);
		int sum =calculate_Diagonal_Sum(matrix,n);
		System.out.println("The sum of diagoanls is : "+sum);
		sc.close();

	}
	public static void displayMatrix(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j] +" ");
				}
			System.out.println();
		}
	}
	public static int calculate_Diagonal_Sum(int[][] matrix,int n) {
		int sum=0;
		
		for (int i=0 ;i<n;i++) {
			sum+= matrix[i][i];
			sum+=matrix[i][n-1-i];
			
		}
		if (n%2 !=0) {
			sum -= matrix[n/2][n/2];
		}
		return sum;
	}

}
