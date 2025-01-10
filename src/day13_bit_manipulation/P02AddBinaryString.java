package day13_bit_manipulation;

public class P02AddBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A = "100";
		String B = "11";

		
		System.out.println(addBinary(A, B));
	}

	public static String addBinary(String A, String B) {

		StringBuilder result = new StringBuilder();
		int i = A.length() - 1;
		int j = B.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0 || carry > 0) {
			int sum = carry;
			if (i >= 0) {
				sum += A.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				sum += B.charAt(j) - '0';
				j--;
			}
			result.append(sum % 2);
			carry = sum / 2;
		}

		return result.reverse().toString();

	}
}
