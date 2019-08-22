/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.toCharArray().length == 1 || s.length() % 2 != 0)
            return false;
        else {
            for (char c : s.toCharArray()) {
                if (c == '}' || c == ')' || c == ']') {
                    if (stack.empty())
                        return false;
                    if (c == ')' && stack.peek() == '(')
                        stack.pop();
                    if (c == '}' && stack.peek() == '{') 
                        stack.pop();
                    if (c == ']' && stack.peek() == '[') 
                        stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.empty();
    }
}

/*
*   Performance :
*   Runtime: 1 ms, faster than 98.50% of Java online submissions for Valid Parentheses.
*   Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Valid Parentheses.
*/