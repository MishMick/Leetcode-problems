class Solution {
    
    private static final char LAND = '1';
    private static final char WATER = '0';

    public int dfs(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == WATER)
            return 0;
        grid[row][col]=WATER;
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        return 1;
            
    }
    public int numIslands(char[][] grid) {
        int islands = 0;
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col] == LAND){
                    islands += dfs(grid,row,col);
                }
            }
        }
        return islands;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Islands.
Memory Usage: 40.6 MB, less than 100.00% of Java online submissions for Number of Islands.
*/
