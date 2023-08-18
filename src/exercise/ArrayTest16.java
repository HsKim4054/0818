package exercise;

import java.util.Scanner;

public class ArrayTest16 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬 크기 : ");
		n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i=0;i<matrix.length;i++) {
			matrix[i][i] = 1;
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<i;j++) {
				matrix[i][j] = matrix[i-1][j];
				if(j>0) matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
			}
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(String.format("%3d",matrix[i][j]));
			}
			System.out.println();
		}
	}

}
