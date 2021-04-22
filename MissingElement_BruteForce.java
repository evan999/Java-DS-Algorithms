class Solution {
	public int missingNumber(int[] nums) {

		List<Integer> arr = new ArrayList<>();

		for (int element = 0; element < nums.length; element++) {
			arr.add(nums[element]);
		}

		Collections.sort(arr);

		int missing = 0;

		for (int element = 0; element < arr.size(); element++) {
			if (arr.get(element) != element + 1) {
				missing = element + 1;
				System.out.println(missing);
			}
		}

		return missing;
	}
}