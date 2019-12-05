class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = Integer.MAX_VALUE;
        
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right])
                left = mid+1;
            else
                right = mid;
        }
        
        int start = 0;
        int end = nums.length-1;
        if(nums[left] < nums[right])
            start = left;
        else
            start = right;
        
        for(int i=start;i<=end;i++){
            if(nums[i] < min)
                min = nums[i];
        }
        return min;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
Memory Usage: 38.2 MB, less than 96.59% of Java online submissions for Find Minimum in Rotated Sorted Array.
*/