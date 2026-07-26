class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            if(!set.add(nums[i])){
                return true;
            }
            
        }
        return false;
    }
}