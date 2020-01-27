class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    public void backtrack(List<String> answer, String current, int open, int close, int max){
        // Base condition
        if(current.length() == max*2){
            answer.add(current);
            return;
        }
        
        // Bound condition : n(open) < max & n(close) < n(open)
        if(open < max)
            backtrack(answer, current+"(", open+1,close, max);
        if(close < open)
            backtrack(answer, current+")", open, close+1, max);
        
        
    }
}

/* Condition: 
Runtime: 4 ms, faster than 14.86% of Java online submissions for Generate Parentheses.
Memory Usage: 41.5 MB, less than 5.16% of Java online submissions for Generate Parentheses.
*/