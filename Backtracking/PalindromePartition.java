class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }
    
    public void backtrack(List<List<String>> list, List<String> tempList, String input, int index){
        if(index == input.length())
            list.add(new ArrayList<>(tempList));
        else{
            for(int i=index;i<input.length();i++){
                if(isPalindrome(input,index,i)){
                    tempList.add(input.substring(index, i+1));
                    backtrack(list, tempList, input, i+1);
                    tempList.remove(tempList.size()-1);
                }
            }   
        }
    }
    
    public boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}

/* Solution:
Runtime: 2 ms, faster than 95.18% of Java online submissions for Palindrome Partitioning.
Memory Usage: 42.6 MB, less than 15.91% of Java online submissions for Palindrome Partitioning.
*/