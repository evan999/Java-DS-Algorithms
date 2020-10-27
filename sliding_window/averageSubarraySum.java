class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverageSum = -10000.0;
        double windowSum = 0;
        int windowStart = 0;
        double windowAverage = -10000.0;
        
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            windowSum+=nums[windowEnd];

            if(windowEnd >= k - 1){
                windowAverage = windowSum / k;
                windowSum -= nums[windowStart];
                windowStart++;
            }
            
            if(windowAverage > maxAverageSum){
                maxAverageSum = windowAverage;
            }
        }
        
        return maxAverageSum;
    }
}