class Solution {
    public boolean checkOnesSegment(String s) {

        int count = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            if(s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
                count++;
            }

            if(s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                count++;
            }
        }

        return count <= 1;
    }
}