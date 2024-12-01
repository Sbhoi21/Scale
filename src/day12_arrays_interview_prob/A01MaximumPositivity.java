/**
 * 
 */
package day12_arrays_interview_prob;

/**
 * 
 * 
 * 
 * Problem Description
 * 
 * Given an array of integers A, of size N. Return the maximum size subarray of
 * A having only non-negative elements. If there are more than one such
 * subarray, return the one having the smallest starting index in A. NOTE: It is
 * guaranteed that an answer always exists. Problem Constraints 1 <= N <= 105
 * -109 <= A[i] <= 109 Input Format The first and only argument given is the
 * integer array A.
 * 
 * Output Format Return maximum size subarray of A having only non-negative
 * elements. If there are more than one such subarrays, return the one having
 * earliest starting index in A. Example Input Input 1: A = [5, 6, -1, 7, 8]
 * 
 * Input 2: A = [1, 2, 3, 4, 5, 6]
 * 
 * Example Output Output 1: [5, 6]
 * 
 * 
 * Output 2: [1, 2, 3, 4, 5, 6]
 * 
 * Example Explanation Explanation 1: There are two subarrays of size 2 having
 * only non-negative elements. 1. [5, 6] starting point = 0 2. [7, 8] starting
 * point = 3 As starting point of 1 is smaller, return [5, 6]
 * 
 * 
 * Explanation 2:
 * 
 * There is only one subarray of size 6 having only non-negative elements: [1,
 * 2, 3, 4, 5, 6]
 * 
 * 
 */

public class A01MaximumPositivity {

	public static void main(String[] args) {

		int[] A = { 5, 6, -1, 7, 8, 9 };
		int[] res = maxset(A);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();

		int[] B = { 1, 2, 3, 4, 5, 6 };
		res = maxset(B);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();

	}

	public static int[] maxset(int[] A) {
		int n = A.length;
		int start = 0;
		int end = 0;
		int maxStart = 0;
		int maxEnd = 0;
		long maxCount = 0;
		long count = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] >= 0) {
				count++;
				end = i;
			} else {
				count = 0;
				start = i + 1;
			}
			if (count > maxCount || (count == maxCount && end - start > maxEnd - maxStart)) {
				maxCount = count;
				maxStart = start;
				maxEnd = end;
			}
		}
		int[] res = new int[maxEnd - maxStart + 1];
		for (int i = 0; i < res.length; i++) {
			res[i] = A[maxStart + i];
		}
		return res;
	}

}
