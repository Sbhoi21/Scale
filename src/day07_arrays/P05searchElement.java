package day07_arrays;

import java.util.Scanner;

public class P05searchElement {

//	
//	Problem Description
//
//	You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.
//
//	Problem Constraints
//
//	1 <= T <= 10
//	1 <= A <= 105
//	1 <= A[i], B <= 109
//
//
//	Input Format
//
//	First line of the input contains number of test cases as single integer T .
//	Next, each of the test case consists of 3 lines:
//
//	First line contains a single integer A denoting the length of array
//	Second line contains A integers denoting the array elements
//	Third line contains a single integer B
//
//
//	Output Format
//
//	For each test case, print on a separate line 1 if the element exists, else print 0.
//
//
//
//	Example Input
//
//	Input 1:
//
//
//
//
//	 1 
//	 5 
//	 4 1 5 9 1
//	 5
//	Input 2:
//
//	 1
//	 3 
//	 7 7 2
//	 1 
//
//
//
//
//
//	Example Output
//
//	Output 1:
//
//
//
//
//	 1 
//	Output 2:
//
//	 0 
//
//
//
//
//
//	Example Explanation
//
//	Explanation 1:
//
//
//
//
//	  B = 5  is present at position 3 in A 
//	Explanation 2:
//
//	  B = 1  is not present in A. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int l = sc.nextInt();
			int a[] = new int[l];
			for (int j = 0; j < l; j++) {
				a[j] = sc.nextInt();
			}
			int b = sc.nextInt();
			boolean f = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b) {
					System.out.println(1);
					f = true;
					break;
				}
			}
			if (f == false) {
				System.out.println(0);
			}

		}
	}

}
