class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1)
                count += 1;
            else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount,count);
    }
}

/* Peformance: 
Runtime: 2 ms, faster than 99.69% of Java online submissions for Max Consecutive Ones.
Memory Usage: 39.3 MB, less than 96.08% of Java online submissions for Max Consecutive Ones.
*/