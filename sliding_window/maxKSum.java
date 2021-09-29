public static int computeMaxSum(List<Integer> nums, int k) {
        int maxSum = -9999;
        int curIndex = 0;
        int curSum = 0;
        while(curIndex < nums.size()-k+1) {
            for (int index = curIndex; index < curIndex + k - 1; index++) {
                curSum += nums.get(index);
                System.out.println(curSum);
                //System.out.println(maxSum);
            }
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            curSum = 0;
            curIndex++;
        }

        return maxSum;
 }