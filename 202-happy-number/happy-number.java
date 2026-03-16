class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        boolean res = false;
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            int newnum = 0;
            while(n>0)
            {
                int mod = n%10;
                int sq = mod*mod;
                newnum = newnum+sq;
                n = n/10;
            }
         n = newnum;
        }
        if(n==1)
        {
             res = true;
        }
        return res;
    }
}