class Solution {
    public String decodeString(String s) {
        Stack<Integer> numst=new Stack<>();
        Stack<StringBuilder> strst=new Stack<>();
        int num=0;
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='['){
                numst.push(num);
                num=0;
                strst.push(ans);
                ans=new StringBuilder();
            }
            else if(c==']'){
                String str=ans.toString();
                ans=new StringBuilder(str.repeat(numst.pop()));
                ans=strst.pop().append(ans);
            }
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}