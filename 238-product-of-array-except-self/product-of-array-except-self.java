class Solution {
    public int[] productExceptSelf(int[] arr) {

        int n = arr.length;
        int[] right = new int[n];

        int pro = 1;
        for(int i=n-1; i>=0; i--){
            pro = pro * arr[i];
            right[i] = pro;
        }

        int[] ans = new int[n];

        int left = 1;
        for(int i=0; i<n-1; i++){
            int val = left * right[i+1];
            ans[i] = val;
            left = left * arr[i];
        }
        ans[n-1] = left;
        return ans;















        // int[] left = new int[nums.length];
        // int[] right = new int[nums.length];

        // left[0] = 1;
        // for(int i=1;i<nums.length;i++){
        //     left[i] = left[i-1] * nums[i-1];
        // }

        // right[nums.length-1] = 1;
        // for(int i=nums.length-2;i>-1;i--){
        //     right[i] = right[i+1] * nums[i+1];
        // }

        // int[] ans = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     ans[i] = left[i] * right[i];
        // }

        // return ans;
        
    }
}