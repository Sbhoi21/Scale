package day19_string;

public class A05LongestCommonPrefix {

	public static String longestCommonPrefix(String[] A) {
		if (A == null || A.length == 0) {
			return "";
		}

		// Start with the first string as the prefix
		String prefix = A[0];

		for (int i = 1; i < A.length; i++) {
			System.out.println("A[" + i + "] " + A[i]);
			while (A[i].indexOf(prefix) != 0) {
				System.out.println("prefix   " + prefix + "  \t index:  " + A[i].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length() - 1);
				System.out.println("prefix2   " + prefix + "  \t index:  " + A[i].indexOf(prefix));
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

	public static void main(String[] args) {
		String[] A1 = { "abcdefgh", "abcghijk", "abcefgh" };
		String[] A2 = { "abab", "ab", "abcd" };

		System.out.println("Longest Common Prefix in A1: " + longestCommonPrefix(A1));
//		System.out.println("Longest Common Prefix in A2: " + longestCommonPrefix(A2));
	}

}
