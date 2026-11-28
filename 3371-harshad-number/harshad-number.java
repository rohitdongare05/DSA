class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n1 = x;
        int sum = 0;
        while(n1 != 0){
            int d = n1 % 10;
            sum = sum + d;
            n1 = n1 / 10;
        }
        if(x%sum == 0){
            return sum;
        }
        return -1;
    }
}