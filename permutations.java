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
			
			List<List<Integer>> permutations = new ArrayList<List<Integer>>();
			
			for(int num = 0; num < nums.length; num++){
					for(int digit = 0; digit < nums[num].length; digit++){
							
					}
			}
			
			
			// Add the first element to the 2D arraylist
			// Loop through array by each element
			
			// For each permutation
			// Need a way to store the permutations
			
			return permutations;
			
			
	}
}