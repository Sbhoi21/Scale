package day12_arrays_interview_prob;

public class P01LongestConsecutiiveOnes {

	// Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
	public static void main(String[] args) {
		String nums = "111111110001";
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(String s) {

		int count = 0;
		int maxCount = 0;
		int zeroCount = 0;
		int firstZeroIndex = -1;
		int secondZeroIndex = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			} else {
				zeroCount++;
				if (firstZeroIndex == -1) {
					firstZeroIndex = i;
				} else {
					secondZeroIndex = i;
				}
				if (zeroCount == 2) {
					count = i - firstZeroIndex;
					zeroCount = 1;
					firstZeroIndex = secondZeroIndex;
					secondZeroIndex = -1;
				}
			}
			maxCount = Math.max(maxCount, count);
		}
		
		return maxCount;
		
	}

}
