class Solution {
    public int pivotIndex(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        int indx=-1;
        
        // Compute left sums in one iteration
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            lsum[i] = sum;
        }
        sum = 0;
        
        // Compute right sums in other iteration
        for(int i=nums.length-1; i >=0; i--){
            sum += nums[i];
            rsum[i] = sum;
        }
        
        for(int i=0;i<nums.length;i++){
            if(lsum[i] == rsum[i]){
                indx = i;
                break;
            }
        }
        
        return indx;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Find Pivot Index.
Memory Usage: 40.4 MB, less than 95.74% of Java online submissions for Find Pivot Index.
*/