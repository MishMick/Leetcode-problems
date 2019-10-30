class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0];
        int row = matrix.length;
        int col = matrix[0].length;
        int[] result = new int[row*col];
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;
        int diagonals = row + col - 1;
        
        while(count < diagonals){
            count++;
            if(count % 2 != 0){
                while(i >=0 && j < col){
                    result[k++] = matrix[i--][j++];
                }
            }else{
                while(i < row && j >= 0){
                    result[k++] = matrix[i++][j--];
                }
            }
            
            if(i == row){
                i = row - 1;
                j += 2;
            }
            else if(j == col){
                j = col - 1;
                i += 2;
            }
            else if(i < 0)
                i = 0;
            else if(j < 0)
                j = 0;
        }
        
        return result;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 93.82% of Java online submissions for Diagonal Traverse.
Memory Usage: 46.3 MB, less than 37.50% of Java online submissions for Diagonal Traverse.
*/