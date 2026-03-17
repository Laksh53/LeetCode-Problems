class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] res = new boolean[nums.length];
        backtrack(result,temp,nums,res);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums,boolean[] res)
    {
        if(temp.size() == nums.length)
        {
            if(!result.contains(temp))
            {
            result.add(new ArrayList<>(temp));
            return;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(res[i])
            {
                continue;
            }
            temp.add(nums[i]);
            res[i] = true;
            backtrack(result,temp,nums,res);
            temp.remove(temp.size()-1);
            res[i] = false;
        }
    }
}