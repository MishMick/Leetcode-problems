class Solution {
    
    public boolean canMerge(int[] A, int[] B){
        if(A[0] <= B[1] && B[0] <= A[1])
            return true;
        else
            return false;
    }
      
    public int[][] merge(int[][] intervals) {
       
        if(intervals.length <= 1) 
            return intervals;
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> result = new ArrayList<>();
        int[] current_interval = intervals[0];
        result.add(current_interval);
        
        for(int[] interval: intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if(canMerge(current_interval, interval)){
                current_interval[1] = Math.max(current_end, next_end);
            }else{
                current_interval = interval;
                result.add(current_interval);
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}

/* Performance :
Runtime: 39 ms, faster than 18.06% of Java online submissions for Merge Intervals.
Memory Usage: 36.7 MB, less than 100.00% of Java online submissions for Merge Intervals.
*/