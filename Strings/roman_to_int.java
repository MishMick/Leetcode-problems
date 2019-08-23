
//Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

import java.util.*;

class roman_to_int {
    public int romanToInt(String s) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        int result = 0;
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            int a = charMap.get(s.charAt(i));
            int b = charMap.get(s.charAt(i + 1));
            if (a == b)
                result = result + a;
            else if (a < b)
                result = result - a;
            else
                result = result + a;
        }
        result = result + charMap.get(s.charAt(s.length() - 1));
        return result;
    }
}

/*
 * Performance: Runtime: 7 ms, faster than 35.92% of Java online submissions for
 * Roman to Integer. Memory Usage: 36 MB, less than 100.00% of Java online
 * submissions for Roman to Integer.
 */