/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 
(where it will stay), or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

*/

class Solution {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
		return Happy(list, n);
    }
    public boolean Happy(List<Integer> list, int n){
        int res = 0;
        list.add(n);
        while(n > 0){
            int temp = n%10;
            n = n/10;
            res += temp*temp;            
        }
        if(res == 1) return true;
        else if(list.contains(res)) return false;
        else
            return Happy(list, res);
    }
    
}

/* Performance: 
Runtime: 1 ms, faster than 94.72% of Java online submissions for Happy Number.
Memory Usage: 33.7 MB, less than 10.60% of Java online submissions for Happy Number.
*/