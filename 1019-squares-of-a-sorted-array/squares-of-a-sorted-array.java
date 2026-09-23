class Solution {
    public int[] sortedSquares(int[] arr) {
        int[] ans = new int[arr.length];

        int start = 0;
        int end = arr.length-1;

        int ptr = ans.length-1;

        while(start<=end){
            int startSquare = arr[start] * arr[start];
            int endSquare = arr[end] * arr[end];

            if(startSquare>endSquare){
                ans[ptr] = startSquare;
                start++;
            }else{
                ans[ptr] = endSquare;
                end--;
            }
            ptr--;
        }

        return ans;
    }
}