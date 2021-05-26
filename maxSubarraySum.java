class Solution {
	public int maxSubArray(int[] nums) {

		int maxSum = nums[0];

		for (int first = 0; first < nums.length; first++) {
			int sum = nums[first];
			maxSum = Math.max(sum, maxSum);
			for (int second = first + 1; second < nums.length; second++) {
				sum += nums[second];
				System.out.println(sum);
				maxSum = Math.max(sum, maxSum);
			}
			maxSum = Math.max(sum, maxSum);
		}

		return maxSum;
	}
}