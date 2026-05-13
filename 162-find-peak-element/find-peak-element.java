class Solution {
    public int findPeakElement(int[] nums) {

        int[] nums1 = nums.clone();

        Arrays.sort(nums1);

        int max = nums1[nums1.length - 1];

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == max) {
                return i;
            }
        }

        return -1;
    }
}