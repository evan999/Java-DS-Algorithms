class Solution {
	public int[] twoSum(int[] nums, int target) {
		// nums = [2, 7, 11, 15]

		// Two pointer approach
		// Initialize result array
		// Initialize two pointers: i and j
		// Assign i to 0
		// assign j to target

		// int[] pair = new int[2];

		// Arrays.sort(nums);

		int i = 0;
		int j = nums.length - 1;

		while (i < j) {
			if (nums[i] + nums[j] == target) {
				return new int[] { i, j };
			} else if (nums[i] + nums[j] < target) {
				i++;
			} else if (nums[i] + nums[j] > target) {
				j--;
			}
		}

		return new int[] {};

	}
}