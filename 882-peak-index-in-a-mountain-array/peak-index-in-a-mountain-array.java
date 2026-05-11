class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int[] nums1 = arr.clone();

        Arrays.sort(nums1);

        int max = nums1[nums1.length - 1];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == max) {
                return i;
            }
        }

        return -1;
        
    }
}