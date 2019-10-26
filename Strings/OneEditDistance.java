class Solution {
    public boolean oneEditInsert(String s, String t){
        int indx1 = 0;
        int indx2 = 0;
        while(indx1 < s.length() && indx2 < t.length()){
        
            if(s.charAt(indx1) != t.charAt(indx2)){
                
                if(indx1 != indx2)
                    return false;
                indx2++;
            }else{
                indx1++;
                indx2++;
            }
        }
        return true;
    }
    public boolean oneEditReplace(String s, String t){
        int indx = 0;
        int foundDifference = 0;
        while(indx < s.length()){
            if(s.charAt(indx) != t.charAt(indx))
                foundDifference += 1;
            indx++;
        }
        return foundDifference == 1 ? true : false;
    }
    public boolean isOneEditDistance(String s, String t) {
        if(s.length() == t.length())
            return oneEditReplace(s, t);
        else if(s.length() == (t.length() + 1))
            return oneEditInsert(t,s);
        else if(s.length() == (t.length() - 1))
            return oneEditInsert(s,t);
        else 
            return false;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 14.81% of Java online submissions for One Edit Distance.
Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for One Edit Distance.
*/