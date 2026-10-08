class Solution {
    static List<String> ans;
    public void gen(int open, int close, int n, String s){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n) gen(open+1, close, n, s+"(");
        if(close<open) gen(open, close+1, n, s+")");
    }
    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        gen(0,0,n,"");
        return ans;
    }
}