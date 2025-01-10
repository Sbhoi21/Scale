package day07_arrays;

import java.util.Scanner;
//
//Problem Description
//
//Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.
//
//Problem constraints
//
//1 <= N <= 1000
//
//1 <= A <= 1000
//
//
//Input Format
//
//The first line contains a single integer N representing the length of the array A followed by N elements of the array A.
//
//
//Output Format
//
//A single line output containing two space-separated integers.
//The first integer is the maximum value of the array.
//The second integer is the minimum value of the array. 
//
//There is **no space** after the minimum value  in the output format. 
//There is only a **single space** between the maximum and minimum value.
//
//
//Example Input
//
//Input 1:
//5 1 2 3 4 5
//Input 2:
//4 10 50 40 80
//
//Example Output
//
//Output 1:
//5 1
//Output 2:
//80 10
//Note: There is no space after the minimum value in the output format.
//There is only a single space between the maximum and minimum value.

public class P03MaxAndMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner d = new Scanner(System.in);
		int l = d.nextInt();
		int a[] = new int[l];
		for (int i = 0; i < l; i++) {
			a[i] = d.nextInt();
		}
		int min = a[0], max = a[0];
		for (int j = 0; j < l; j++) {
			if (min > a[j]) {
				min = a[j];
			}
			if (max < a[j]) {
				max = a[j];
			}
		}
		System.out.println(max + " " + min);

	}

}
