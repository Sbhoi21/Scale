package day11_arrays_2Dmatrix;

public class P01AddMatrices {

//	Q1. Add the matrices
//	Solved
//	feature icon
//	Using hints except Complete Solution is Penalty free now
//	Use Hint
//	Problem Description
//
//	You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
//	Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
//
//	The Following will give you an idea of matrix addition:
//
//
//
//	Problem Constraints
//
//	1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000
//	Input Format
//
//	The first argument is the 2D integer array A The second argument is the 2D integer array B
//	Output Format
//
//	You have to return a vector of vector of integers after doing required operations.
//	Example Input
//
//	Input 1:
//	A = [[1, 2, 3],   
//	     [4, 5, 6],   
//	     [7, 8, 9]]  
//
//	B = [[9, 8, 7],   
//	     [6, 5, 4],   
//	     [3, 2, 1]]
//	 
//	Input 2:
//	A = [[1, 2, 3],   
//	     [4, 1, 2],   
//	     [7, 8, 9]]  
//
//	B = [[9, 9, 7],   
//	     [1, 2, 4],   
//	     [4, 6, 3]]
//	 
//	Example Output
//
//	Output 1:
//	[[10, 10, 10],   
//	 [10, 10, 10],   
//	 [10, 10, 10]]
//	Output 2:
//	[[10, 11, 10],   
//	 [5,   3,  6],   
//	 [11, 14, 12]]
//	Example Explanation
//
//	Explanation 1:
//	A + B = [[1+9, 2+8, 3+7],  
//	         [4+6, 5+5, 6+4],  
//	         [7+3, 8+2, 9+1]]   
//	      = [[10, 10, 10],   
//	         [10, 10, 10],   
//	         [10, 10, 10]].
//	Explanation 2:
//	A + B = [[1+9, 2+9, 3+7],  
//	         [4+1, 1+2, 2+4],  
//	         [7+4, 8+6, 9+3]]   
//	      = [[10, 11, 10],   
//	         [5,   3,  6],   
//	         [11, 14, 12]].

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] c = solve(A, B);

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println("c[" + i + "][" + j + "]= " + c[i][j]);
			}
		}

		System.out.println("c = ");
		for (int i = 0; i < c.length; i++) {
			System.out.print("[");
			for (int j = 0; j < c[i].length; j++) {
				System.out.print("\t" + c[i][j] + ",");
			}
			System.out.print("]\n");

		}

		int[][] A1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B1 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] d = solve(A1, B1);

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.println("d[" + i + "][" + j + "]= " + d[i][j]);
			}
		}

	}

	public static int[][] solve(int[][] A, int[][] B) {

		int rows = A.length;
		int cols = A[0].length;

		// Initialize the resulting matrix with the same dimensions as A and B
		int[][] result = new int[rows][cols];

		// Iterate through each element and calculate the sum
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		return result;

	}

}
