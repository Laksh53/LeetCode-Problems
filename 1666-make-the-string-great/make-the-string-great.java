class Solution {
    public String makeGood(String s) {
        if(s.length() == 1 || s.length() == 0)
        {
            return s;
        }
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
           if(!st.isEmpty() && (st.peek() - ch == 32 || st.peek() - ch == -32))
           {
                st.pop();
           }
           else
           {
                st.push(ch);
           }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st)
        {
            sb.append(ch);
        }
        return sb.toString();
    }
}
