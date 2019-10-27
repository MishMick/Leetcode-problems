class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) 
            return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right])
                left = mid + 1;        
            else
                right = mid;
        }
        
        int start = left;
        left = 0;
        right = nums.length - 1;
        
        if(target >= nums[start] && target <= nums[right]){
            left = start;
        }else{
            right = start;
        }
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        
        System.out.println("Updated limits: "+left+", "+right);
        
        return -1;
    }
}

/* Perfomance: 
Runtime: 1 ms, faster than 11.24% of Java online submissions for Search in Rotated Sorted Array.
Memory Usage: 36 MB, less than 100.00% of Java online submissions for Search in Rotated Sorted Array.
*/