class NumMatrix {
    private int[][] mat;
    public NumMatrix(int[][] matrix) {
        mat = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        
        int cIndx = col1;
        do{
            for(int i = row1; i <= row2; i++){
                sum += mat[i][cIndx];
            }
            cIndx++;
        }while(cIndx <= col2);     
        
        return sum;

    }
}

/* Performance: 
Runtime: 266 ms, faster than 5.46% of Java online submissions for Range Sum Query 2D - Immutable.
Memory Usage: 60.3 MB, less than 6.06% of Java online submissions for Range Sum Query 2D - Immutable.
*/