class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        //BRUTE FORCE
        int ans[] = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;




        //OPTIMIZED CODE!
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<nums.length;i++){

        //     int complement = target - nums[i];
        //     if(map.containsKey(complement)){
        //         return new int[] {map.get(complement),i};
        //     }
        //     map.put(nums[i],i);
        // }
        // return null;
    }
}