package day04_introduction_to_prob_solving;

import java.util.Scanner;

public class A01ArmStrongNumber {

	// Q1. ArmStrong Number
//	You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
//
//	If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
//
//	For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
//
//	Note: All the test cases in this problem are limited to 3 digit numbers.
//
//
//
//	Problem Constraints
//
//	1 <= N <= 500
//
//
//
//	Input Format
//
//	First and only line of input contains an integer N.
//
//
//
//	Output Format
//
//	Output all the Armstrong numbers in range [1,N] each in a new line.
//
//
//
//	Example Input
//
//	Input 1:
//
//	 5
//	Input 2:
//
//	 200
//
//
//	Example Output
//
//	Output 1:
//
//	1
//	Output 2:
//
//	1
//	153
//
//
//	Example Explanation
//
//	Explanation 1:
//
//	1 is an armstrong number.
//	Explanation 2:
//
//	1 and 153 are armstrong number under 200.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 200;
		printArmstrongNumbers(n);
		
		n = 5;
		printArmstrongNumbers(n);
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		printArmstrongNumbers(n);
	}
	
	public static void printArmstrongNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isArmstrong(int n) {
		int sum = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			sum += rem * rem * rem;
			n /= 10;
		}
		return sum == temp;
	}

}
