class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seeNumbers = new HashSet<>();

        for(int num : nums){
            if(seeNumbers.contains(num)){
                return true;
            }
            seeNumbers.add(num);
        }        
        return false;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // HashSet<Integer> seeNumbers = new HashSet<>();

        // for(int num : nums){
        //     if(seeNumbers.contains(num)){
        //         return true;
        //     }
        //     seeNumbers.add(num);
        // }
        // return false;
    }
}