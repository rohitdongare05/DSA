class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split("\\s+"); //splits on the basis of spaces

        StringBuilder sb = new StringBuilder("");
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i] + " ");
        }

        //trim() = removes trailind and leading spaces.
        String ans = sb.toString();
        ans = ans.trim();
        return ans;
    }
}