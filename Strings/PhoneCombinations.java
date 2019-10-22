import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits == null || digits.length() == 0) return list;
        HashMap<Character, String> map = new HashMap<Character, String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        char[] chArr = digits.toCharArray();
        list.add("");
        for(char c:chArr)
            list = expand(list, (map.get(c).toCharArray()));
        return list;
    }
    private List<String> expand(List<String> l,char[] arr){
        List<String> next = new ArrayList<String>();
        for(String s:l){
            //System.out.println("String: "+(s));
            for(char c: arr){
                //System.out.println("Char: "+(s+c));
                next.add(s+c);
            }
        }
        //System.out.println("Next here "+next);
        return next;
    }
}

/* Performance: 
Runtime: 1 ms, faster than 64.50% of Java online submissions for Letter Combinations of a Phone Number.
Memory Usage: 36.1 MB, less than 98.63% of Java online submissions for Letter Combinations of a Phone Number.
*/