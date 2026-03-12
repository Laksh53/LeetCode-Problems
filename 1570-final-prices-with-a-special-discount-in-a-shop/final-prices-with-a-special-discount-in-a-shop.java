class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<prices.length;i++)
        {
            while(!st.isEmpty() && prices[i]<=prices[st.peek()])
            {
                int top = st.pop();
                prices[top] -= prices[i];
            }
            st.push(i);
        }
        return prices;
    }
}