class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        int i;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(i=0;i<n;i++){
            
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;

        
    }
}