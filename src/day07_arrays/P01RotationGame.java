package day07_arrays;

import java.util.Scanner;

public class P01RotationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) { // Automatically closes the scanner
			// Input size of the array
			int size = sc.nextInt();

			// Validate array size
			if (size <= 0) {
				System.out.println("Array size must be a positive integer.");
				return;
			}

			// Input array elements
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}

			// Input number of positions to rotate
			int rotateBy = sc.nextInt();

			// Validate rotation value
			if (rotateBy < 0) {
				System.out.println("Rotation count cannot be negative.");
				return;
			}

			// Ensure d is within the bounds of the array
			rotateBy = rotateBy % size;

			// If no rotation needed, just print the original array
			if (rotateBy == 0) {
				printArray(arr);
				return;
			}

			// Perform the rotation in an optimized way
			int[] rotatedArray = new int[size];

			// Copy the last 'rotateBy' elements to the start of the array
			int k = 0;
			for (int i = size - rotateBy; i < size; i++) {
				rotatedArray[k++] = arr[i];
			}

			// Copy the first 'size - rotateBy' elements to the end of the array
			for (int i = 0; i < size - rotateBy; i++) {
				rotatedArray[k++] = arr[i];
			}

			// Output the rotated array
			printArray(rotatedArray);
		}
	}

	// Helper method to print array elements
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void basCode() {
		Scanner sc = new Scanner(System.in);

		// take length
		int n = sc.nextInt();
		int a[] = new int[n];
		// take values
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		// take rotation number.
		int d = sc.nextInt();
		d = d % n;
		// initialize new array
		int temp[] = new int[n];
		int k = 0;
		// add elements from ratating num to last
		for (int i = n - d; i < n; i++) {
			temp[k] = a[i];
			k++;
		}
		// add remaining (first to rotating num.)
		for (int i = 0; i < n - d; i++) {

			temp[k] = a[i];
			k++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
