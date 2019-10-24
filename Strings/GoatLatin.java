class Solution {
    public String wordToGL(String word, int index){
        String result = word;
        char[] vowels = {'a','e','i','o','u','O','A','E','I','U'};
        char[] wordArr = word.toCharArray();
        boolean contains = false;
        for (char c : vowels) {
            if (c == wordArr[0]) {
                contains = true;
                break;
            }
        }
        
        if (!contains) {
            // do something
            result = result.substring(1,result.length());
            result += wordArr[0];
            
        }
       
        result += "ma";
        for(int i = 0; i<index;i++)
            result += "a";
        
        return result;
    }
    public String toGoatLatin(String S) {
        String[] given = S.split(" ");
        String result = "";
        for(int i=0;i<given.length-1;i++){
            result += wordToGL(given[i],(i+1));
            result += " ";
        }
        result += wordToGL(given[given.length-1],(given.length));
        return result;
    }
}

/* Performance: 
Runtime: 2 ms, faster than 95.12% of Java online submissions for Goat Latin.
Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Goat Latin.
*/