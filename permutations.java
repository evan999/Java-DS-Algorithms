class Solution {
	public List<List<Integer>> permute(int[] nums) {
			// Heap's algorithm to generate all permutations of the numbers in the array.
			// Generates (n-1)! permutations of the first n-1 elements
			// if n is odd (n is not divisible by 2)
			//  swap first and last element
			// if n is even 
			//  swap ith element and last element 
			//  repeat until i < n
			// 
			if(nums.length == 0){
					return Collections.emptyList();
			}
			
			if(nums.length == 1){
					// No need to permute if there is only one element in array
			}
			
			
			List<List<Integer>> permutations = new ArrayList<List<Integer>>();
			
			//permutations.add(new ArrayList<Integer>());
			
			for(int num = 0; num < nums.length-1; num++){
					//permutations.get(0).add(nums[num]);
					// swapping
					// if nums.length is odd
					//   swap(nums[i], nums[n-1])
					if(nums.length % 2 != 0){
							// swap(nums[1], nums[n-1])
							int temp = nums[nums.length-1];
							nums[nums.length - 1] = nums[0];
							nums[0] = temp;
					}
					else{
							// swap(nums[i], nums[n-1])
							int temp = nums[nums.length-1];
							nums[nums.length - 1] = nums[num];
							nums[num] = temp;
					}
					
					// add permutations to the arraylist
					//permutations.get(0).add(nums);
					List<Integer> numsList = Arrays.asList(nums);
					permutations.get(0).add(numsList);
					
					
			}
			
			
			// Add the first element to the 2D arraylist
			// Loop through array by each element
			
			// For each permutation
			// Need a way to store the permutations
			
			return permutations;
			
			
	}
	
}