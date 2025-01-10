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

	// O(nlogn)
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

	//O(n)
	public static int solve1(int[] A) {
		if (A == null || A.length < 2) {
			return -1;
		}
		// Initialize largest with the smallest possible integer value
		// Initialize second largest with the smallest possible integer value
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Iterate through the array to find the largest and second largest elements
		for (int num : A) {
			// If the current element is greater than the largest found so far
			if (num > largest) {
				// Update second largest to be the previous largest
				// Update largest to be the current element
				secondLargest = largest;
				largest = num;
			}
			// If the current element is between second-largest and largest
			else if (num > secondLargest && num != largest) {
				secondLargest = num; // Update second largest to be the current element
			}
		}

		// If second largest is still Integer.MIN_VALUE, it means no valid second-
		// largest was found
		return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
	}

}
