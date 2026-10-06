class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> list = new ArrayList<>();
        
        long res = 1;
        list.add((int)res);

        for(int i=1; i<=r; i++){
            res = res *(r-i+1) / i;
            list.add((int)res);
        }

        return list;
    }
}