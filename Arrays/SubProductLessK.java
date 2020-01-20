class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        /* Pseudocode:
        Init two pointers i and j
        with j = i+1
        keeping i fixed; increase window size with j++
        increment i until length
        get product of all such subarrays
        increment count if subarray sum > k
        return count
        */
        int result = 0;
        if(k <= 1)
            return result;
        
        int left = 0;
        int right = 0;
        int product = 1;
        
        while(right < nums.length){
            product *= nums[right];
            
            while(product >= k){
                product /= nums[left];
                left++;
            }
            
            result += right - left + 1;
            
            right++;
        }
        
        
        return result;
    }
}

/* Performance:
Runtime: 11 ms, faster than 20.42% of Java online submissions for Subarray Product Less Than K.
Memory Usage: 60.7 MB, less than 7.14% of Java online submissions for Subarray Product Less Than K.
*/