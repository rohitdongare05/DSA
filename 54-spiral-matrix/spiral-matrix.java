class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int m = arr.length; int n = arr[0].length;
        List<Integer> res = new ArrayList<>();

        
		int minr = 0; int maxr = m-1;
		int minc = 0; int maxc = n-1;
		
		while(minr <= maxr && minc <= maxc) {
			
			for(int j=minc; j<=maxc; j++) {
				res.add(arr[minr][j]);
			}minr++;
			
			if(minr > maxr || minc > maxc) break;
			for(int i=minr; i<=maxr; i++) {
				res.add(arr[i][maxc]);
			}maxc--;
			
			if(minr > maxr || minc > maxc) break;
			for(int j=maxc; j>=minc; j--) {
				res.add(arr[maxr][j]);
			}maxr--;
			
			if(minr > maxr || minc > maxc) break;
			for(int i=maxr; i>=minr; i--) {
				res.add(arr[i][minc]);
			}minc++;
		}
        return res;
    }
}