package z_classroom;

public class SquareRoot {

	// FIND SQUARE ROOT OF A NUMBER

	public static void main(String[] args) {
		System.out.println(sqrt(5));
	}

	// Binary Search
	public static int sqrt(int A) {
		if (A == 0 || A == 1)
			return A;
		int start = 1, end = A, ans = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid <= A / mid) {
				start = mid + 1;
				ans = mid;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

}
