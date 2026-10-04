class Solution {
    public int majorityElement(int[] nums) {

        int ele = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(count == 0){
                count++;
                ele = nums[i];
            }else if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ele;
        // int majority = nums[0], votes = 1;
        // for(int i=1; i<nums.length; i++){
        //     if(votes == 0){
        //         votes++;
        //         majority = nums[i];
        //     }else if(majority == nums[i]){
        //         votes++;
        //     }else{
        //         votes--;
        //     }
        // }
        // return majority;

        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}