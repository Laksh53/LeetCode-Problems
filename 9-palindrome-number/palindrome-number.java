class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        String s=String.valueOf(x); // convert integr into string
        //using two pointer to check palindrome properties
        int left=0;
        int right=s.length()-1;
        while(left < right) 
        {
            if(s.charAt(left) != s.charAt(right))  
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}