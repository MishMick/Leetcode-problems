public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i = 1; i < m; ++i) grid[i][0] += grid[i - 1][0];
        for(int j = 1; j < n; ++j) grid[0][j] += grid[0][j - 1];
    
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}

/* Performance:
Runtime: 2 ms, faster than 90.82% of Java online submissions for Minimum Path Sum.
Memory Usage: 41.4 MB, less than 89.19% of Java online submissions for Minimum Path Sum.
*/