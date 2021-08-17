class Solution {
	public int findDuplicate(int[] nums) {
		HashMap<Integer, Integer> uniques = new HashMap<>();

		for (int num = 0; num < nums.length; num++) {
			Integer currentNum = nums[num];
			if (uniques.containsKey(currentNum)) {
				return currentNum;
			} else {
				uniques.put(currentNum, 1);
			}
		}

		return -1;
	}
}