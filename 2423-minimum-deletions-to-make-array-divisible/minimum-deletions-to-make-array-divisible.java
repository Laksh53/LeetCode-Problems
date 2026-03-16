class Solution {
    static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        int n=nums.length;
        int m=numsDivide.length;
        Arrays.sort(nums);
        int initial=numsDivide[0];
        for(int i=1;i<m;i++)
        {
            initial=gcd(initial,numsDivide[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(initial%nums[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}