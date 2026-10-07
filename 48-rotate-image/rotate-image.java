class Solution {
    public void rotate(int[][] arr) {
        
        int m = arr.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                int temp1 = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp1;
            }
        }
        for(int i=0; i<m; i++){
            int a = 0;
            int b = m-1;
            while(a<b){
                int temp2 = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] =  temp2;
                a++;
                b--; 
            } 
        }
    }
}