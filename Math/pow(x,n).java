class Solution {
    private double fastPow(double x, long n){
        if(n == 0)
            return 1.0;
        double half = fastPow(x,n/2) ;
        if(n % 2 == 0)
            return half * half;
        else
            return half * half * x;
    }
    public double myPow(double x, int n) {
        long N = n;
        if(n < 0){
            x = 1/x;
            N = -N;
        }
        
        return fastPow(x,N);
    }
}

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Pow(x, n).
Memory Usage: 33.6 MB, less than 5.88% of Java online submissions for Pow(x, n).
*/