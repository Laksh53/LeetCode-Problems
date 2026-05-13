class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {

            ArrayList<Integer> digits = new ArrayList<>();

            while (num > 0) {
                digits.add(num % 10); // get last digit
                num = num / 10;       // remove last digit
            }

            // reverse order
            for (int i = digits.size() - 1; i >= 0; i--) {
                list.add(digits.get(i));
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}