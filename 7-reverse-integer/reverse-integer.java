class Solution {
    public int reverse(int x) {
        long xNew=0;
        int copy=x;
        while(x!=0)
        {
        int temp=x%10;
        xNew=(xNew*10)+temp;
        x=x/10;
        }
        if(xNew>Integer.MAX_VALUE||xNew<Integer.MIN_VALUE)
        {
            return 0;
        }
        else
        {
        return (int) xNew;
        }
    }
}