class Solution {
    public int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }
    public int search(int[] nums, int start, int end){
        if(start == end)
            return start;
        int mid = start + (end - start)/2;
        if(nums[mid] > nums[mid+1])
            // reducing the search space
            return search(nums, start, mid);
        return search(nums, mid+1, end);
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
Memory Usage: 37 MB, less than 100.00% of Java online submissions for Find Peak Element.
*/