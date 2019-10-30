class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int start=0;start<nums.length;start++){
            int sum = 0;
            for(int end=start;end<nums.length;end++){
                sum += nums[end];
                if(sum == k)
                    count++;
            }
        }
        return count;
    }
}

/* Performance: 
Runtime: 115 ms, faster than 25.96% of Java online submissions for Subarray Sum Equals K.
Memory Usage: 38.3 MB, less than 98.91% of Java online submissions for Subarray Sum Equals K.
*/