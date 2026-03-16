class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1)
        {
            return;
        }
        int i = 0;
        int j = 0;
        while(i < n)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
    }
}