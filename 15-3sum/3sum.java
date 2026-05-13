class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        List<Integer> temp;
        List<List<Integer>> result=new ArrayList<>();
        while(i<nums.length-2)
        {
           
            if(i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
            int value=nums[i]+nums[j]+nums[k];
            if(value==0)
            {
                 temp=new ArrayList<>();
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                result.add(temp);
                 j++;
                    k--;
            while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
            }
            else if(value<0)
            {
                j++;
                
            }
            else
            {
                k--;
            }
           
        }
         
            i++;}
        return result;
    }
}