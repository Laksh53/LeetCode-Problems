class Solution {
    static int[]dp;
    public static int HR(int[]nums,int n){
        if(n==0)
            return 0;
        else if(n==1)
            return nums[0];
        else if(dp[n]!=-1) return dp[n];
        int evenpic=nums[n-1]+HR(nums,n-2);
        int oddpic=HR(nums,n-1);
        dp[n] = Math.max(evenpic, oddpic);
        return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if (n == 1) return nums[0];
        int[]case1=Arrays.copyOfRange(nums,0,n-1);
        int x=case1.length;
        dp=new int[x+1];
        Arrays.fill(dp,-1);
        int max1=HR(case1,x);
        int[]case2=Arrays.copyOfRange(nums,1,n);
        int y=case2.length;
        dp=new int[y+1];
        Arrays.fill(dp,-1);
        int max2=HR(case2,y);
        return Math.max(max1,max2);
        
    }
}