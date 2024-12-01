/**
 * 
 */
package day07_arrays;

import java.util.Arrays;

/**
 * 
 */
public class A02SecondLargest {

	/**
	 * @param args
	 * 
	 *             Problem Description
	 * 
	 *             You are given an integer array A. You have to find the second
	 *             largest element/value in the array or report that no such element
	 *             exists. Problem Constraints 1 <= |A| <= 105 0 <= A[i] <= 109
	 * 
	 *             Input Format The first argument is an integer array A.
	 * 
	 *             Output Format Return the second largest element. If no such
	 *             element exist then return -1.
	 * 
	 * 
	 * 
	 *             Example Input Input 1: A = [2, 1, 2] Input 2: A = [2]
	 * 
	 * 
	 *             Example Output Output 1: 1 Output 2: -1
	 * 
	 * 
	 *             Example Explanation Explanation 1: First largest element = 2
	 *             Second largest element = 1 Explanation 2: There is no second
	 *             largest element in the array.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = { 2, 1, 2 };
		System.out.println(solve(A));
		
	}

	public static int solve(int[] A) {
		int n = A.length;

		Arrays.sort(A);

		int max = A[n - 1];
		int secondMax = -1;
		for (int i = n - 2; i >= 0; i--) {
			if (A[i] < max) {
				return A[i];
			}
		}
		return -1;

	}

}
