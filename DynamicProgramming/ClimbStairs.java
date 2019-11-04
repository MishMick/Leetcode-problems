class Solution {
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
Memory Usage: 32.7 MB, less than 5.26% of Java online submissions for Climbing Stairs.
*/