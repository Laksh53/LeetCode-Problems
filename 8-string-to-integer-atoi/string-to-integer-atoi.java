class Solution {
    public int myAtoi(String s) {
        int num = 0;
        int len = s.length();
        int sign = 1;
        int started = 0; // 0 = not started, 1 = started

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            // skip leading spaces
            if (started == 0 && c == ' ') continue;

            // sign only before number starts
            else if (started == 0 && (c == '-' || c == '+')) {
                if (c == '-') sign = -1;
                started = 1;
            }

            // digits
            else if (Character.isDigit(c)) {
                started = 1;
                int n = c - '0';

                // overflow check
                if (num > (Integer.MAX_VALUE - n) / 10) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                num = num * 10 + n;
            }

            // stop on anything else
            else {
                break;
            }
        }

        return num * sign;
    }
}