class Solution {
    public int lengthOfLastWord(String s) {
        int cout = 0;
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                cout++;
            }else if(cout!=0){
                break;
            }
        }
        return cout;
    }
}