class Solution {
    public int orangesRotting(int[][] grid) {
        final int EMPTY = 0;
        final int FRESH = 1;
        final int ROTTEN = 2;

        final List<int[]> DIRECTIONS = Arrays.asList(
            new int[] { 1,  0},
            new int[] {-1,  0},
            new int[] { 0,  1},
            new int[] { 0, -1}
        );
        
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        
        int freshOranges = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int row = 0;row<m;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col] == ROTTEN)
                    q.add(new int[]{row,col});
                else if(grid[row][col] == FRESH)
                    freshOranges += 1;
            }
        }
        if(freshOranges == 0) return 0;
        int count = 0;
        while(!q.isEmpty()){
            ++count;
            int size = q.size();
            for(int i = 0 ; i < size ; i++) {
                int[] point = q.poll();
                int row = point[0];
                int col = point[1];

                for(int[] direction: DIRECTIONS){
                    int r = row + direction[0];
                    int c = col + direction[1];
                    if(r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0 || grid[r][c] == 2) continue;
                    grid[r][c] = ROTTEN;
                    q.add(new int[]{r,c});
                    freshOranges--;
                }
            }
        }
        
        return freshOranges == 0 ? count-1: -1;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 85.05% of Java online submissions for Rotting Oranges.
Memory Usage: 38.1 MB, less than 81.25% of Java online submissions for Rotting Oranges.
*/