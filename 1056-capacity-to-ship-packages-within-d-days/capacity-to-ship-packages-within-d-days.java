class Solution {

    public boolean isPossible(int c, int[] arr, int d){
        int n = arr.length;
        int load = 0;
        int days = 1;
        for(int i=0; i<n; i++){
            if(load + arr[i] <= c) load = load + arr[i];
            else{
                load = arr[i];
                days++;
            }
        }
        if(days>d) return false;
        else return true;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            mx = Math.max(mx, arr[i]);
            sum += arr[i];
        }
        int lo = mx;
        int hi = sum;
        int minC = sum;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(mid, arr, days) == true){
                minC = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return minC;
    }
}