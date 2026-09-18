class Solution {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        // int size = nums.length;
        // if(size == 0 || size == 1){
        //     return;
        // }
        // int nz = 0;
        // int z = 0;
        // while(nz < size){

        //     if(nums[nz] != 0){
        //         int temp = nums[nz];
        //         nums[nz] = nums[z];
        //         nums[z] = temp;
        //         nz++;
        //         z++;
        //     }else{
        //         nz++;
        //     }
        // }
    }
}