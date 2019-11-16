class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        if(A == null || A.length == 0) return -1;
        Arrays.sort(A);
        int i = 0;
        int j = A.length-1;
        int res = -1;
        while(i < j){
            if(A[i] + A[j] >= K){
                j--;
            }else{
                res = Math.max(res, A[i]+A[j]);
                i++;
            }
        }
        return res;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Two Sum Less Than K.
Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Two Sum Less Than K.
*/