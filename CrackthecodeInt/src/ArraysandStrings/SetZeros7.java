package ArraysandStrings;

import java.util.Scanner;

public class SetZeros7 {
	
	public static void main(String[] args){
		//int[][] matrix =new int[2][2];
		
		Scanner in = new Scanner(System.in);
		
		int nbr1 = in.nextInt();
		int nbr2 = in.nextInt();
		int [][] matrix = new int[nbr1][nbr2];
		System.out.println(" "+ matrix[0][0]);
		
	}
	public static void setZeros(int[][] matrix) {
		 int[] row = new int[matrix.length];
		 int[] column = new int[matrix[0].length];
		 // Store the row and column index with value 0
		 for (int i = 0; i < matrix.length; i++) {
		 for (int j = 0; j < matrix[0].length;j++) {
		 if (matrix[i][j] == 0) {
		 row[i] = 1;
		 column[j] = 1;
		 }
		 }
		 }
		
		 // Set arr[i][j] to 0 if either row i or column j has a 0
		 for (int i = 0; i < matrix.length; i++) {
		 for (int j = 0; j < matrix[0].length; j++) {
		 if ((row[i] == 1 || column[j] == 1)) {
		 matrix[i][j] = 0;
		 }
		 }
		 }
		 }

}
