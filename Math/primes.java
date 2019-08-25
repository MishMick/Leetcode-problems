// Count the number of prime numbers less than a non-negative number, n.

class Solution {
    static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
    public int countPrimes(int n) {
        int counter = 0;
        for(int i=2;i<n;i++){
            if(isPrime(i))
                counter++;
        }
        return counter;
    }
}

/* Performance:
Runtime: 570 ms, faster than 9.97% of Java online submissions for Count Primes.
Memory Usage: 32.8 MB, less than 67.92% of Java online submissions for Count Primes.
*/