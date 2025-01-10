package day07_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P04ReverseArray {

//	Problem Description
//	You are given a constant array A.
//	You are required to return another array which is the reversed form of the input array.
//
//	Problem Constraints
//	1 <= A.size() <= 10000
//	1 <= A[i] <= 10000
//
//
//	Input Format
//	First argument is a constant array A.
//
//
//	Output Format
//	Return an integer array.
//
//
//	Example Input
//	Input 1:
//	A = [1,2,3,2,1]

//	Input 2:
//
//	A = [1,1,10]
//
//
//	Example Output
//
//	Output 1:
//
//	 [1,2,3,2,1] 
//	Output 2:
//
//	 [10,1,1] 
//
//
//	Example Explanation
//
//	Explanation 1:
//
//	Reversed form of input array is same as original array
//	Explanation 2:
//
//	Clearly, Reverse of [1,1,10] is [10,1,1]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> L = Arrays.asList(1, 2, 3, 2, 5);
		ArrayList<Integer> s = solve(L);

		System.out.println(s);

	}

	// O(n/2)
	public static ArrayList<Integer> solve(final List<Integer> A) {
		ArrayList<Integer> arr = new ArrayList(A);
		int s = arr.size();
		for (int i = 0; i < s / 2; i++) {
			int t = arr.set(s - i - 1, arr.get(i));
			arr.set(i, t);
		}
		return arr;
	}

	
	// Explaination
	public static ArrayList<Integer> solve1(final List<Integer> A) {
		// copied array, coz they wanted not to touch main array
		ArrayList<Integer> arr = new ArrayList(A);
		System.out.println(arr);
		int s = arr.size();

		// loop from first to mid
		for (int i = 0; i < s / 2; i++) {
			System.out.println("s-i-1: " + (s - i - 1) + "     arr.get(" + i + ") : " + arr.get(i));

			// set elements from last index and return the previous value it was holding
			// arr.set(i,j) basically returns previous value arr.get(i) holding.
			int t = arr.set(s - i - 1, arr.get(i));
			System.out.println("t: " + t);
			arr.set(i, t);
		}
		return arr;
	}

}
