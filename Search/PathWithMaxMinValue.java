class Solution {
    private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] { 1,  0},
        new int[] {-1,  0},
        new int[] { 0,  1},
        new int[] { 0, -1}
    );
    public int maximumMinimumPath(int[][] A) {
        int m = A.length;
        if (m == 0) return 0;
        int n = A[0].length;
        
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[2] - a[2]);            //max to min (descending order) -> maximum min value
        pq.offer(new int[]{0, 0, A[0][0]});
        boolean[][] visited = new boolean[m][n];
        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int row = cell[0];
            int col = cell[1];
            if(row == m-1 && col == n-1)
                return cell[2];
            
            visited[row][col] = true;
            for(int[] direction: DIRECTIONS){
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];
                if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n || visited[nextRow][nextCol]) continue;
                pq.offer(new int[]{nextRow, nextCol, Math.min(cell[2], A[nextRow][nextCol])});
            }
        }
        return -1;
    }
}

/* Performance: 
Runtime: 350 ms, faster than 7.38% of Java online submissions for Path With Maximum Minimum Value.
Memory Usage: 58.7 MB, less than 100.00% of Java online submissions for Path With Maximum Minimum Value.
*/
