class Solution {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder("");
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[i] == arr[j]) j++;
            else{
                //ans = ans + arr[i]; for String
                ans.append(arr[i]);  // for StringBuilder
                int len = j-i;
                if(len>1) {
                   // ans = ans + len;  for string
                   ans.append(len); //for StringBuilder
                }
                i = j;
            }
        }
        ans.append(arr[i]); //for StringBuilder
        int len = j-i;
        if(len>1) ans.append(len); //for stringBuilder
        for(i=0; i<ans.length(); i++){
            arr[i] = ans.charAt(i);
        }
        return ans.length();
    }
}