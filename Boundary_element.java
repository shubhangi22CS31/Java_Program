package shubhangijava;

import java.util.Scanner;

public class Boundary_element {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the matrix (nxn):");
		int n= sc.nextInt();
		int[][] matrix = new int[n][n];
		
		System.out.print("enter the element of matrix:");
		for (int i=0;i<n; i++) {
			for (int j=0;j<n;j++) {
				matrix[i][j] =sc.nextInt();
				
			}
			
		}
		
		System.out.println("matrix:");
		displayMatrix(matrix);
		System.out.println("boundary element of the matrix:");
		Boundary(matrix);
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
	public static void Boundary(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] result =new int[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j = 0; j<cols; j++){
				result[i][j]=0;
				}
		}
	
		for(int i=0;i<cols;i++) {
			result[0][i]=matrix[0][i];
		}
		for(int i =0;i<rows;i++) { 
			result[i][cols-1]=matrix[i][cols-1];
		}
		if (rows>1) {
			for(int i=cols-2;i>=0;i--) {
				result[rows-1][i]=matrix[rows-1][i];
			}
		}
		if (cols>1) {
			for(int i=rows-2;i>0;i--) {
				result[i][0]=matrix[i][0];
			}
		}
		for (int i=0; i<rows; i++) {
			for (int j = 0; j<cols; j++){
				System.out.print(result[i][j] +" ");
				}
			System.out.println();
		}
		System.out.println();	
	}
	
}

