class Solution {
    public int calcArea(int[] heights, int start, int end){
        int width = end - start;
        int height = Math.min(heights[start], heights[end]);
        return width*height;
    }
    public int maxArea(int[] height) {
        int trapped = 0;
        int left = 0;
        int right = height.length-1;
        
       
        while(left < right){
            //Compare [left+1, right] and [left, right-1]
            trapped = Math.max(trapped, calcArea(height, left, right));
            // Area affected by the shorter height
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
     
        return trapped;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 95.18% of Java online submissions for Container With Most Water.
Memory Usage: 39.8 MB, less than 94.87% of Java online submissions for Container With Most Water.
*/