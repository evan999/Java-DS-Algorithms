class Solution {
    public int climbStairs(int n) {
        if(n < 4){
            // Only one way to climb one stair!
            return n;
        }
        
        return climbStairs(n-1) + climbStairs(n-2);
    }
}