package day19_string;

public class P07LongestPallindrome {

//	
//	Q7. Longest Palindromic Substring
//	Unsolved
//	feature icon
//	Using hints except Complete Solution is Penalty free now
//	Use Hint
//	Problem Description
//
//	Given a string A of size N, find and return the longest palindromic substring in A.
//
//	Substring of string A is A[i...j] where 0 <= i <= j < len(A)
//
//	Palindrome string:
//	A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
//
//	Incase of conflict, return the substring which occurs first ( with the least starting index).
//
//
//
//	Problem Constraints
//
//	1 <= N <= 6000
//
//
//
//	Input Format
//
//	First and only argument is a string A.
//
//
//
//	Output Format
//
//	Return a string denoting the longest palindromic substring of string A.
//
//
//
//	Example Input
//
//	Input 1:
//	A = "aaaabaaa"
//	Input 2:
//	A = "abba
//
//
//	Example Output
//
//	Output 1:
//	"aaabaaa"
//	Output 2:
//	"abba"
//
//
//	Example Explanation
//
//	Explanation 1:
//	We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
//	Explanation 2:
//	We can see that longest palindromic substring is of length 4 and the string is "abba".

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A1 = "abbcccbbbcaaccbababcbcabca";
		String A2 = "abba";

		System.out.println("Longest Palindromic Substring in A1: " + longestPalindrome(A1));
//        System.out.println("Longest Palindromic Substring in A2: " + longestPalindrome(A2));

	}

	public static String longestPalindrome1(String A) {
		int n = A.length();
		if (n <= 1) {
			return A;
		}

		int start = 0, maxLength = 1;

		// Dynamic programming table to store palindrome status
		boolean[][] dp = new boolean[n][n];

		// All substrings of length 1 are palindromes
		for (int i = 0; i < n; i++) {
			dp[i][i] = true;
		}

		// Check for substrings of length 2
		for (int i = 0; i < n - 1; i++) {
			if (A.charAt(i) == A.charAt(i + 1)) {
				dp[i][i + 1] = true;
				start = i;
				maxLength = 2;
			}
		}

		// Check for substrings of length greater than 2
		for (int len = 3; len <= n; len++) {
			for (int i = 0; i < n - len + 1; i++) {
				int j = i + len - 1;
				if (A.charAt(i) == A.charAt(j) && dp[i + 1][j - 1]) {
					dp[i][j] = true;
					start = i;
					maxLength = len;
				}
			}
		}

		return A.substring(start, start + maxLength);
	}

//	abbcccbbbcaaccbababcbcabca
	// first occurance
	public static String longestPalindrome(String A) {
		int n = A.length();
		if (n <= 1) {
			return A;
		}

		int start = 0, maxLength = 1;

		// Dynamic programming table to store palindrome status
		boolean[][] dp = new boolean[n][n];

		// All substrings of length 1 are palindromes
		for (int i = 0; i < n; i++) {
			dp[i][i] = true;
		}

		// Check for substrings of length 2
		for (int i = 0; i < n - 1; i++) {
			if (A.charAt(i) == A.charAt(i + 1)) {
				dp[i][i + 1] = true;
				if (maxLength < 2) {
					start = i;
					maxLength = 2;
				}
			}
		}
		// Check for substrings of length greater than 2
		for (int len = 3; len <= n; len++) {
			for (int i = 0; i < n - len + 1; i++) {
				int j = i + len - 1;
				System.out.println("Checking substring: " + A.substring(i, j + 1)); // Print the substring being checked
				if (A.charAt(i) == A.charAt(j) && dp[i + 1][j - 1]) {
					dp[i][j] = true;
					System.out.println("Palindrome found: " + A.substring(i, j + 1)); // Print if it's a palindrome
					if (len > maxLength) {
						start = i;
						maxLength = len;
						System.out.println("Updated longest palindrome: " + A.substring(start, start + maxLength));
					}
				}
			}
		}

		return A.substring(start, start + maxLength);
	}

}
