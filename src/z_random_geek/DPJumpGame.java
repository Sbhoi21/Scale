package z_random_geek;

public class DPJumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 2, 1,0, 4 };
		System.out.println(canJump(nums));

	}

	public static boolean canJump(int[] nums) {
		int curr = nums.length - 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println("nums[" + i + "] = " + nums[i] + " \t curr= " + curr);
			if (nums[i] + i >= curr) {
				curr = i;
			}
		}
		if (curr == 0) {
			return true;
		}
		return false;
	}

}
