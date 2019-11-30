class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // narrowing the col range first
        // narrow the row range second
        
        if(matrix.length == 0 || matrix == null)
            return false;
        
        int row = matrix.length-1;
        int col = 0;
        
        while(row >=0 && col < matrix[0].length){
            if(matrix[row][col] > target)
                row--;
            else if(matrix[row][col] < target)
                col++;
            else 
                return true;
        }
        return false;
    }
}

//Time complexity: O(m+n) 
//Space complexity: O(1) 

/* Performance: 
Runtime: 5 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix II.
Memory Usage: 41.3 MB, less than 100.00% of Java online submissions for Search a 2D Matrix II.
*/