class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] res = new int[2 * n];
        for(int i=0; i<arr.length; i++){
            res[i] = arr[i];
            res[i + n] = arr[i];
        }
        // for(int j=0; j<arr.length; j++){
        //     newArr[j + n] = arr[j];
        // }
        return res;
    }
}