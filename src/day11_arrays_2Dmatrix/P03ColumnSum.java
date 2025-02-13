package day11_arrays_2Dmatrix;

public class P03ColumnSum {

//	Q3. Column Sum
//	Solved
//	feature icon
//	Using hints except Complete Solution is Penalty free now
//	Use Hint
//	Problem Description
//
//	You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
//
//
//
//	Problem Constraints
//
//	1 <= A.size() <= 103
//
//	1 <= A[i].size() <= 103
//
//	1 <= A[i][j] <= 103
//
//
//
//	Input Format
//
//	First argument is a 2D array of integers.(2D matrix).
//
//
//
//	Output Format
//
//	Return an array containing column-wise sums of original matrix.
//
//
//
//	Example Input
//
//	Input 1:
//
//	[1,2,3,4]
//	[5,6,7,8]
//	[9,2,3,4]
//
//
//	Example Output
//
//	Output 1:
//
//	{15,10,13,16}
//
//
//	Example Explanation
//
//	Explanation 1
//
//	Column 1 = 1+5+9 = 15
//	Column 2 = 2+6+2 = 10
//	Column 3 = 3+7+3 = 13
//	Column 4 = 4+8+4 = 16
//

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };
		PrintMatrix.printArray(solve(A));
	}

	public static int[] solve(int[][] matrix) {

		if (matrix == null || matrix.length == 0) {
			throw new IllegalArgumentException("Matrix must be non-null and non-empty.");
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[] colSums = new int[cols];
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++) {
				colSums[j] += matrix[i][j];
			}
		}
		return colSums;

	}

}
