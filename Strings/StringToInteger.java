class Solution {
    
    private static boolean isDigit(char c) {
        return  (c >= '0' && c <= '9');
    }
    
    
    public int myAtoi(String str) {
     
        double num = 0;
        int indx = 0;
        int sign = 1;
    
        str = str.trim();
        if(str == "" || str.length() == 0) 
            return 0;
        
        char firstChar = str.charAt(0);
        if(firstChar == '-'){
            indx++;
            sign = -1;
        }else if(firstChar == '+'){
            indx++;
            sign = 1;
        }
        
        for(int i=indx;i<str.length();i++){
            if(!isDigit(str.charAt(i)))
                break;
            num = num*10 + str.charAt(i)-'0';
        }
        
        if(sign == 1 && num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(sign == -1 && num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)(sign*num);
    }
}

/* Performance: 
Runtime: 2 ms, faster than 59.54% of Java online submissions for String to Integer (atoi).
Memory Usage: 36 MB, less than 100.00% of Java online submissions for String to Integer (atoi).
*/