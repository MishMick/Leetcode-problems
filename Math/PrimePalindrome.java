class Solution {
    public int primePalindrome(int N) {
        while(true){
            if(N == reverse(N) && isPrime(N)){
                return N;
            }
            N++;
            if (10000000 < N && N < 100000000)  // Mathematical proof
                N = 100000000;
        }
    }
    
    public boolean isPrime(int N){
        if(N<2) return false;
        int R = (int)Math.sqrt(N);
        for(int d=2;d<=R;++d){
            if(N%d == 0)
                return false;
        }
        return true;
    }
    
    public int reverse(int N){
        int ans = 0;
        while(N > 0){
            ans = 10*ans+(N%10);
            N /= 10;
        }
        return ans;
    }
}

/* Performance: 
Runtime: 16 ms, faster than 78.59% of Java online submissions for Prime Palindrome.
Memory Usage: 32.9 MB, less than 50.00% of Java online submissions for Prime Palindrome.
*/