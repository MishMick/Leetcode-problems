class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        if(m == 0 || matrix == null)
            return;
        // What if very first cell itself is zero?
        for(int j=0;j<n;j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }
        // Set markers at the beginning of these rows and columns containing zeroes
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // Setting zeroes for consecutive entries in row-direction and col-direction
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        // Check for first row / col
        if(firstRowZero){
            for(int j=0;j<n;j++){
                matrix[0][j] = 0;
            }
        }
        if(firstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
    }
}

/* Performance: 
Runtime: 1 ms, faster than 98.17% of Java online submissions for Set Matrix Zeroes.
Memory Usage: 42.5 MB, less than 95.71% of Java online submissions for Set Matrix Zeroes.
*/