class Solution {
    
    public List<Integer> getRowForIndex(List<Integer> prevRow, int currIndx,int target){
        
        List<Integer> result = new ArrayList<>();
        
        if(currIndx == target){
            return prevRow;
        }
        
        result.add(1);

        for(int j=1;j<=currIndx;j++)
            result.add(prevRow.get(j-1)+prevRow.get(j));
        
        result.add(1);
        
        currIndx++;

        return getRowForIndex(result, currIndx, target); 
    }
    
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if(rowIndex == 0)
            return result;
        result.add(1);
        if(rowIndex == 1)
            return result;
        return getRowForIndex(result, 0,rowIndex);
    }
}

/* performance: 
Runtime: 1 ms, faster than 90.11% of Java online submissions for Pascal's Triangle II.
Memory Usage: 33.6 MB, less than 6.17% of Java online submissions for Pascal's Triangle II.
*/
