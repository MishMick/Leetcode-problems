// Given a non-empty array of integers, every element appears twice except for one. Find that single one.

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++)
        {
            result = result ^ nums[i];
        }
        return result;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
Memory Usage: 38.5 MB, less than 98.52% of Java online submissions for Single Number.
*/