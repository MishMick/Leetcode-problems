class Solution {

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int r=0;r<m;r++)
            grid[r][0] = 1;
        for(int c=0;c<n;c++)
            grid[0][c] = 1;
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j] = grid[i][j-1] + grid[i-1][j];   // i can come from left or up
            }
        }
        
        return grid[m-1][n-1];
    }
}

/* Performance:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
Memory Usage: 33 MB, less than 5.10% of Java online submissions for Unique Paths.
*/