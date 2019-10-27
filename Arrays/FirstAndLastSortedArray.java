class Solution {
    public static int binSearchFirst(int[] nums, int target){
        int idx = -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
            if(nums[mid] == target){
               idx = mid;
            }
        }
        return idx;
    }
    public static int binSearchLast(int[] nums, int target){
        int idx = -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
            if(nums[mid] == target){
               idx = mid;
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0 || nums == null) 
            return new int[]{-1,-1};
    
        result[0] = binSearchFirst(nums,target) ;
        result[1] = binSearchLast(nums,target);
        
        return result;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
Memory Usage: 39.9 MB, less than 100.00% of Java online submissions for Find First and Last Position of Element in Sorted Array.
*/