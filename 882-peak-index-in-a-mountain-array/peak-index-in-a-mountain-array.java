class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1;
        int hi = n-2;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return -1;
        //BRUTE FORCE
        // for(int i=1; i<=n-2; i++){
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
        //         return i;
        //     }
        // }
    }
}