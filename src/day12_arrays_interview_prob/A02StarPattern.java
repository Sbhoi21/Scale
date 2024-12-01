package day12_arrays_interview_prob;

import java.util.Scanner;

public class A02StarPattern {

//	
//	Problem Description
//	Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
//	See example for clarifications over the pattern.
//
//	Problem Constraints
//	1 <= N <= 1000
//	Input Format
//	First line is an integer N
//	Output Format
//	N lines conatining only char '*' as per the question.
//
//	Example Input
//	Input 1:
//	4
//	Input 2:
//	6
//
//	Example Output
//	Output 1:
//	********
//	***  ***
//	**    **
//	*      *
//	*      *
//	**    **
//	***  ***
//	********
//	Output 2:
//	************
//	*****  *****
//	****    ****
//	***      ***
//	**        **
//	*          *
//	*          *
//	**        **
//	***      ***
//	****    ****
//	*****  *****
//	************
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		printHollowDiamond(N);
	}

	public static void printHollowDiamond(int n) {

		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = n - 1; i >= 0; i--) {
			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			for (j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
