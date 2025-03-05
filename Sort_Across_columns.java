package shubhangijava;
import java.util.Arrays;
import java.util.Scanner;
public class Sort_Across_columns {
	public static void sortColumns(int[][] matrix) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        for (int j = 0; j < cols; j++) {

	            int[] column = new int[rows];
	            for (int i = 0; i < rows; i++) {
	                column[i] = matrix[i][j];
	            }
	             Arrays.sort(column);
	             for (int i = 0; i < rows; i++) {
	                matrix[i][j] = column[i];
	            }
	        }
	    }
	    
	    public static void displayMatrix(int[][] matrix) {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

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
			System.out.println("Original Matrix:");
			displayMatrix(matrix);
			sortColumns(matrix);
			System.out.println("\nMatrix After Sorting Columns:");
			displayMatrix(matrix);
			sc.close();

		}
}