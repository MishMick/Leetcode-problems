class Solution {
    
    public void moveZeroes(int[] nums) {
        int indx = 0;
        for(int i=0;i<nums.length;i++){
           if(nums[i] != 0){
               nums[indx++] = nums[i];
           }
        }
        for(int i=indx;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}

/* performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Move Zeroes.
*/