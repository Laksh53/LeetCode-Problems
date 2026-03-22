class Solution {
    public int compress(char[] chars) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < chars.length) 
        {
            char cur = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == cur) 
            {
                count++;
                i++;
            }
            st.push(cur);
            if(count > 1) 
            {
                String num = String.valueOf(count);
                for(char c : num.toCharArray()) 
                {
                    st.push(c);
                }
            }
        }
        int len = 0;
        for(char c : st) 
        {
            chars[len++] = c;
        }
        return len;
    }
}