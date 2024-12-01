/**
 * 
 */
package day08_arrays_prefix_sum;

/**
 * 
 */
public class A01TimeToEquality {

	/**
	 * @param args
	 * 
	 * 
	 *             Problem Description
	 * 
	 *             Given an integer array A of size N. In one second, you can
	 *             increase the value of one element by 1.
	 * 
	 *             Find the minimum time in seconds to make all elements of the
	 *             array equal.
	 * 
	 * 
	 *             Problem Constraints
	 * 
	 *             1 <= N <= 1000000 1 <= A[i] <= 1000
	 * 
	 * 
	 *             Input Format
	 * 
	 *             First argument is an integer array A.
	 * 
	 * 
	 *             Output Format
	 * 
	 *             Return an integer denoting the minimum time to make all elements
	 *             equal.
	 * 
	 * 
	 *             Example Input
	 * 
	 *             A = [2, 4, 1, 3, 2]
	 * 
	 * 
	 *             Example Output
	 * 
	 *             8
	 * 
	 * 
	 *             Example Explanation
	 * 
	 *             We can change the array A = [4, 4, 4, 4, 4]. The time required
	 *             will be 8 seconds.
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 2, 4, 1, 3, 2 };
		System.out.println(solve(A));
		
		int[] B = { 1, 2, 3, 4, 5 };
		System.out.println(solve(B));
		
	}
	
	
	public static int solve(int[] A) {
		int n = A.length;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, A[i]);
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += max - A[i];
		}
		return ans;
	}
	

}
