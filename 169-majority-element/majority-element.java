class Solution {
    public int majorityElement(int[] nums) {
        
        //MOORE'S VOTING ALGORITHM
        int ele = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
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
        

        //BRUTE FORCE
        // Arrays.sort(nums);
        // return nums[nums.length/2];
    }
}