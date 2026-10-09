class Solution {
    public double average(int[] salary) {
        double mx = Integer.MIN_VALUE;
        double mn = Integer.MAX_VALUE;
        double sum = 0;

        for(int i=0; i<salary.length; i++){
            if(salary[i]>mx){
                mx = salary[i];
            }
            if(salary[i]<mn){
                mn = salary[i];
            }
            sum = sum + salary[i];
        }
        double total = sum-mx-mn;
        double avg = total/(salary.length-2);
        return avg;
    }
}