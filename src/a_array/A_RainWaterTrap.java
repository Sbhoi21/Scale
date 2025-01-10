package a_array;

public class A_RainWaterTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
//
//		Problem Constraints
//		1 <= |A| <= 100000
//
//		Input Format
//		First and only argument is the vector A
//
//		Output Format
//		Return one integer, the answer to the question
//
//		Example Input
//		Input 1:
//		A = [0, 1, 0, 2]
//		Input 2:
//		A = [1, 2]
//
//
//		Example Output
//		Output 1:
//		1
//		Output 2:
//		0
//
//		Example Explanation
//		Explanation 1:
//
//		1 unit is trapped on top of the 3rd element.
//		Explanation 2:
//
//		No water is trapped.

		int[] A = { 0, 1, 0, 2 };
		
		
		
		System.out.println(trap(A));
		
	}

	public static int trap(final int[] A) {
		int n = A.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int water = 0;
		left[0] = A[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], A[i]);
		}
		right[n - 1] = A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], A[i]);
		}
		for (int i = 0; i < n; i++) {
			water += Math.min(left[i], right[i]) - A[i];
		}
		return water;
	}
	
	public static int trap2(final int[] A) {
		int n = A.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int water = 0;
		left[0] = A[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], A[i]);
		}
		right[n - 1] = A[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], A[i]);
		}
		for (int i = 0; i < n; i++) {
			water += Math.min(left[i], right[i]) - A[i];
		}
		return water;
	}

}
