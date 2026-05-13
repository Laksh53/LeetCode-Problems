class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";

        // take first string as reference
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // check boundary
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return ans;
                }
            }

            ans += ch;
        }

        return ans;
    }
}