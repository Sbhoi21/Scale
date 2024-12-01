/**
 * 
 */
package day08_arrays_prefix_sum;

/**
 * 
 */
public class A02ProductArrayPuzzle {

	/**
	 * @param args
	 * 
	 *             Given an array of integers A, find and return the product array
	 *             of the same size where the ith element of the product array will
	 *             be equal to the product of all the elements divided by the ith
	 *             element of the array.
	 * 
	 *             Note: It is always possible to form the product array with
	 *             integer (32 bit) values. Solve it without using the division
	 *             operator.
	 * 
	 * 
	 *             Input Format
	 * 
	 *             The only argument given is the integer array A. Output Format
	 * 
	 *             Return the product array. Constraints
	 * 
	 *             2 <= length of the array <= 1000 1 <= A[i] <= 10 For Example
	 * 
	 *             Input 1: A = [1, 2, 3, 4, 5] Output 1: [120, 60, 40, 30, 24]
	 * 
	 *             Input 2: A = [5, 1, 10, 1] Output 2: [10, 50, 5, 50]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 1, 2, 3, 4, 5 };

		int[] B = { 5, 1, 10, 1 };

		for (int i : productArray(A)) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i : productArray(B)) {
			System.out.print(i + " ");
		}

		System.out.println();

	}

	public static int[] productArray(int[] A) {

		int n = A.length;

		int[] left = new int[n];
		int[] right = new int[n];

		int[] product = new int[n];

		left[0] = 1;
		right[n - 1] = 1;
		int i = 1, j = n - 2;

		while (i < n && j >= 0) {
			left[i] = left[i - 1] * A[i - 1];
			i++;
			right[j] = right[j + 1] * A[j + 1];
			j--;
		}

		for (int k = 0; k < n; k++) {
			product[k] = left[k] * right[k];
		}

		return product;

	}

}
