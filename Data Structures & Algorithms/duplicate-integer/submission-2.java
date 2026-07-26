class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dupexist=false;
        int n=nums.length;
       // HashSet<Integer> set =new Hashset<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}