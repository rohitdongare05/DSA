class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int currCount = 0;
        int maxCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                currCount++;
                maxCount = Math.max(currCount, maxCount);
            }else{
                currCount = 0;
            }
        }
        return maxCount;
    }
}