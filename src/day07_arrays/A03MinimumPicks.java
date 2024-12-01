/**
 * 
 */
package day07_arrays;

/**
 * 
 */
public class A03MinimumPicks {

	/**
	 * @param args
	 * 
	 * 
	 *             You are given an array of integers A of size N. Return the
	 *             difference between the maximum among all even numbers of A and
	 *             the minimum among all odd numbers in A.
	 * 
	 *             Problem Constraints
	 *             2 <= N <= 1e5 -1e9 <= A[i] <= 1e9 There is atleast 1 odd and 1
	 *             even number in A
	 * 
	 * 
	 *             Input Format
	 *             The first argument given is the integer array, A.
	 * 
	 *             Output Format
	 *             Return maximum among all even numbers of A - minimum among all
	 *             odd numbers in A.
	 * 
	 *             Example Input
	 *             Input 1:
	 *             A = [0, 2, 9]
	 * 
	 *             Input 2:
	 *             A = [5, 17, 100, 1]
	 * 
	 * 
	 *             Example Output
	 *             Output 1:
	 *             -7
	 * 
	 *             Output 2:
	 *             99
	 * 
	 * 
	 *             Example Explanation
	 *             Explanation 1:
	 *             Maximum of all even numbers = 2 Minimum of all odd numbers = 9
	 *             ans = 2 - 9 = -7
	 * 
	 *             Explanation 2:
	 *             Maximum of all even numbers = 100 Minimum of all odd numbers = 1
	 *             ans = 100 - 1 = 99
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 0, 2, 9 };
		System.out.println(solve(A));
		
		int[] B = { 5, 17, 100, 1 };
		System.out.println(solve(B));
		
	}
	
	public static int solve(int[] A) {
     
		int n = A.length;
		int minOdd = Integer.MAX_VALUE;
		int maxEven = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			if (A[i] % 2 == 0) {
				maxEven = Math.max(maxEven, A[i]);
			} else {
				minOdd = Math.min(minOdd, A[i]);
			}
		}
		
		return maxEven - minOdd;
		
		
		
	
	
	}

}
