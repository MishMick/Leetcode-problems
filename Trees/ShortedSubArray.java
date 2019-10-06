class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        
        if(nums.length == 1) return 0;
        
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                start = i;
                break;
            }
        }
        
        for(int i = nums.length-1; i > 0; --i){
            if(nums[i-1] > nums[i]){
                end = i;
                break;
            }
        }
        int min = 1000;
        int max = -1000;
        for(int i = start; i <= end; i++){
            if(nums[i] > max)
                max = nums[i];
            if(nums[i] < min)
                min = nums[i];
        }
        

        for(int i=0;i <= start; i++){
            if(nums[i] > min)
                start = i;
        }
  
        for(int i=end;i <= nums.length-1; i++){
            if(nums[i] < max)
                end = i;
        }
     
        int flag = -1;
        for(int i=start+1; i<= end; i++){
            if(nums[i-1] >= nums[i]){
                flag = 1;
                int temp = nums[i];
                nums[i-1] = nums[i];
                nums[i] = temp;
            }
        }
        
        

        return flag == -1 ? 0 : ((end-start)+1);
    }
}

/* 
Performance: 
Runtime: 2 ms, faster than 91.90% of Java online submissions for Shortest Unsorted Continuous Subarray.
Memory Usage: 39.6 MB, less than 100.00% of Java online submissions for Shortest Unsorted Continuous Subarray.
*/