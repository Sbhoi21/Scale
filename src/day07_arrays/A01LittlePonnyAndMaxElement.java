/**
 * 
 */
package day07_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class A01LittlePonnyAndMaxElement {

	/**
	 * @param args
	 * 
	 * 
	 *             Problem Description
	 * 
	 *             Little Ponny is given an array, A, of N integers. In a particular
	 *             operation, he can set any element of the array equal to -1.
	 * 
	 *             He wants your help in finding out the minimum number of
	 *             operations required such that the maximum element of the
	 *             resulting array is B. If it is not possible, then return -1.
	 * 
	 * 
	 * 
	 *             Problem Constraints
	 * 
	 *             1 <= |A| <= 105
	 * 
	 *             1 <= A[i] <= 109
	 * 
	 * 
	 * 
	 *             Input Format
	 * 
	 *             The first argument of input contains an integer array, A.
	 * 
	 *             The second argument of input contains an integer, B.
	 * 
	 * 
	 * 
	 *             Output Format
	 * 
	 *             Return an integer representing the answer.
	 * 
	 * 
	 * 
	 *             Example Input
	 * 
	 *             Input 1:
	 * 
	 *             A = [2, 4, 3, 1, 5] B = 3 Input 2:
	 * 
	 *             A = [1, 4, 2] B = 3
	 * 
	 * 
	 *             Example Output
	 * 
	 *             Output 1:
	 * 
	 *             2 Output 2:
	 * 
	 *             -1
	 * 
	 * 
	 *             Example Explanation
	 * 
	 *             Explanation 1:
	 * 
	 *             We need to remove 4 and 5 to make 3 the biggest element.
	 *             Explanation 2:
	 * 
	 *             As 3 doesn't exist in the array, the answer is -1.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 2, 4, 3, 1, 5 };
		int B = 3;
		System.out.println(solve(A, B));

	}

	public static int solve(int[] A, int B) {
		int n = A.length;
		Arrays.sort(A);
		// convert to sorted set
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(A[i]);
		}

		System.out.println(set);

		if (!set.contains(B)) {
			return -1;
		} else {
			int count = 0;
			// iterate set from back
			for (int i = n - 1; i >= 0; i--) {
				if (A[i] > B) {
					count++;
				} else if (A[i] == B) {
					break;
				}
			}
			return count;
		}

	}

}
