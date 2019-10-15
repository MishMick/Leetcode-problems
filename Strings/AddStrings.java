class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        char[] num1Array = num1.toCharArray();
        char[] num2Array = num2.toCharArray();
        while(i >= 0 || j >= 0 || carry == 1){
            int num1i = i >= 0 ? (num1Array[i--] - '0') : 0;
            int num2i = j >= 0 ? (num2Array[j--] - '0') : 0;
            int sum = num1i + num2i + carry;
            sb.append(sum%10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}

/* Performance: 
Runtime: 2 ms, faster than 95.54% of Java online submissions for Add Strings.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Add Strings.
*/