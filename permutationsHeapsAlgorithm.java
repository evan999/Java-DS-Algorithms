class Solution {
	public List<List<Integer>> permute(int[] nums) {

		// int i = 0;
		// while(i < nums.length){
		// i++;
		// }
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length; i++) {
			List<Integer> inner = new ArrayList<>();
			if (nums.length % 2 == 0) {
				swap(nums, nums[0], nums[nums.length - 1]);
			}
		}

		return permutations;
	}

	public void swap(int[] values, int i, int j) {
		int value = nums[i];
		nums[i] = nums[j];
		nums[j] = value;
	}
}