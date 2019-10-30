class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Remove Element.
*/