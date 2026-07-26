class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        //int num;
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            else{
                set.add(num);
            }
        }
        return false;
        
    }
}