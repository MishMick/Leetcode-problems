class Solution {
    public List<List<Integer>> generate(int numRows) {
       /* Pseudocode: 
       
        row -> list -> pascal
        first row -> row.add(1); - > add to pascal
        pascal now : [[1]]
    
        pascal.newRow = [pascal.get(row-1).get(rowIter+1), pascal.get(row-1).get(rowIter+2)] ;
        return pascal
        
       */
        
        List<List<Integer>> pascal = new ArrayList<>();
        if(numRows == 0)
            return pascal;
        pascal.add(Arrays.asList(1));
        for(int rowSize=1;rowSize<numRows;rowSize++){
            List<Integer> row = new ArrayList<>();            
            row.add(1);
            for(int iter=1; iter<rowSize; iter++){
                row.add(pascal.get(rowSize-1).get(iter-1) + pascal.get(rowSize-1).get(iter));
            }
            row.add(1);
            pascal.add(row);
        }
        
        return pascal;
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
Memory Usage: 33.6 MB, less than 7.23% of Java online submissions for Pascal's Triangle.
*/