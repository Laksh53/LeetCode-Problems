class Solution {
    int dp[];

    public int houseRobber(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } 
        if (n == 1) {
            return arr[0];
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int evenpic = arr[n - 1] + houseRobber(arr, n - 2);
        int oddpic = houseRobber(arr, n - 1);

        return dp[n] = Math.max(evenpic, oddpic);
    }

    public int rob(int[] nums) {
        int arr[] = nums;
        int n = arr.length;

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int result = houseRobber(arr, n);
        return result;
    }
}