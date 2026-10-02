class Solution {
    public int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[2 * n];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        for(int j=0; j<arr.length; j++){
            newArr[j + n] = arr[j];
        }
        return newArr;
    }
}