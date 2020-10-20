class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // return all possible subsets of the array nums
        // no duplicate subsets
        // A subset is a grouping of one or more of its elements.
        // Add each single element as a subset
        // If no elements, return empty list
        // If one element, return sole subset of the array
        
        // How can we get the other subsets?
        // 
        // One possible approach: 
        // Generate the binary numbers from 0 to 2^n-1
        List<List<Integer>> subsets = new ArrayList<>();
        
        if(nums.length == 0){
            return Collections.emptyList();
        }
        
        // Add empty subset to subsets
        
        
        
        for(int num = 0; num < nums.length; num++){
            subsets.add(new ArrayList<Integer>());
            subsets.get(num).add(nums[num]);            
            
        }
             
        return subsets;
        
    }
}