class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                smax = max;
                max = nums[i];
                maxIdx = i;
            }else if(nums[i]>smax){
                smax = nums[i];
            }
        }
        if(smax*2 <= max){
            return maxIdx;
        }else{
            return -1;
        }
    }
}