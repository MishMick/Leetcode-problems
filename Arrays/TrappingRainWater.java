class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int left_max = 0;
        int right_max = 0;
        int trapped = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= left_max){
                    left_max = height[left];
                }else{
                    trapped += left_max - height[left];
                }
                ++left;
            }else{
                if(height[right] >= right_max){
                    right_max = height[right];
                }else{
                    trapped += right_max - height[right];
                }
                --right;
            }
        }
        
        return trapped;
    }
}

/* Performance: 
Runtime: 81 ms, faster than 5.51% of Java online submissions for Trapping Rain Water.
Memory Usage: 37.1 MB, less than 99.32% of Java online submissions for Trapping Rain Water.
*/