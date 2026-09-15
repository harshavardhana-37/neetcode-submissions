class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i,j;
        int n=nums.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
        
    }
}