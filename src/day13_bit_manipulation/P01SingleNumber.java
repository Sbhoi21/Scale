package day13_bit_manipulation;

public class P01SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 1, 2, 2, 3, 1 };
		System.out.println(singleNumber(A));
	}

	public static int singleNumber(final int[] A) {
		int result = 0;

		// Use XOR to find the element that appears only once
		for (int num : A) {
			result ^= num;
			System.out.println("num " + num + " --> " + result);
		}

		return result;
	}

}
