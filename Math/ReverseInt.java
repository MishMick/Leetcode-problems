// Given a 32-bit signed integer, reverse digits of an integer.

class ReverseInt {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        int sign = 1;
        if (x < 0)
            sign = -1;
        long result = 0;
        long number = Math.abs((long) x);
        do {
            result = result * 10 + number % 10;
            number = number / 10;
        } while (number != 0);
        if (sign * result > Integer.MAX_VALUE || sign * result < Integer.MIN_VALUE)
            return 0;
        return sign * (int) result;
    }
}

/*
 * Performance: Runtime: 1 ms, faster than 100.00% of Java online submissions
 * for Reverse Integer. Memory Usage: 33.4 MB, less than 11.66% of Java online
 * submissions for Reverse Integer.
 */