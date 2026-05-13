class Solution {

    public int minOperations(String s) {

        int pattern1 = 0;
        int pattern2 = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected1;
            char expected2;

            // pattern1 -> 010101
            // pattern2 -> 101010

            if (i % 2 == 0) {

                expected1 = '0';
                expected2 = '1';

            } else {

                expected1 = '1';
                expected2 = '0';
            }

            if (s.charAt(i) != expected1) {
                pattern1++;
            }

            if (s.charAt(i) != expected2) {
                pattern2++;
            }
        }

        return Math.min(pattern1, pattern2);
    }
}