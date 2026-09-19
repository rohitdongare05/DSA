class Solution {
    public int maxSubArray(int[] arr) {
        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currentSum = currentSum + arr[i];
            if(currentSum > max){
                max = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return max;
    }
}