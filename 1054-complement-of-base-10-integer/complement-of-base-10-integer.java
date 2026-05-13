class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        String str="";
        while(n>0){
            int x=n%2;
            n=n/2;
            str=x+str;
        }
        StringBuilder ans = new StringBuilder();
        for (char s : str.toCharArray()) {
            if (s == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }
        return Integer.parseInt(ans.toString(), 2);
    }
}