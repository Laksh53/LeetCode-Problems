class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> res,String s,int oc,int cc,int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(oc<n){
            backtrack(res,s+"(",oc+1,cc,n);
        }
        if(cc<oc){
            backtrack(res,s+")",oc,cc+1,n);
        }
    }
}