class Solution {
    public String addBinary(String a, String b) {
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        int carry = 0;
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        int indx1 = a.length()-1;
        int indx2 = b.length()-1;
        StringBuilder sb = new StringBuilder();
        while(indx1 >= 0 || indx2 >= 0 || carry == 1){
            int digit1i = indx1 >= 0 ? arrA[indx1--] - '0' : 0;
            int digit2i = indx2 >= 0 ? arrB[indx2--] - '0' : 0;
            int sum = digit1i ^ digit2i ^ carry;
            carry = ((digit1i + digit2i + carry >= 2)) ? 1 : 0;
            sb.append(sum);
        }
            
        return sb.reverse().toString();
    }
}

/* Performance: 
Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Binary.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Add Binary.
*/