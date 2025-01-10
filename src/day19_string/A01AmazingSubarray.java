package day19_string;

public class A01AmazingSubarray {

//	Q1. Amazing Subarrays
//	Unsolved
//	feature icon
//	Using hints except Complete Solution is Penalty free now
//	Use Hint
//	You are given a string S, and you have to find all the amazing substrings of S.
//
//	An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
//
//	Input
//
//	Only argument given is string S.
//	Output
//
//	Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
//	Constraints
//
//	1 <= length(S) <= 1e6
//	S can have special characters
//	Example
//
//	Input
//	    ABEC
//
//	Output
//	    6
//
//	Explanation
//	    Amazing substrings of given string are :
//	    1. A
//	    2. AB
//	    3. ABE
//	    4. ABEC
//	    5. E
//	    6. EC
//	    here number of substrings are 6 and 6 % 10003 = 6.

	public static int countAmazingSubarrays(String S) {
		int count = 0;
		int n = S.length();
		final int MOD = 10003;

		for (int i = 0; i < n; i++) {
			char c = Character.toLowerCase(S.charAt(i));
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count = (count + (n - i)) % MOD; // Add the number of substrings starting from i
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String S1 = "ABEC";
		String S2 = "AmazingSubarrays";

//		System.out.println("Number of amazing substrings in S1: " + countAmazingSubarrays(S1));
		System.out.println("Number of amazing substrings in S2: " + countAmazingSubarrays(S2));
	}

}
