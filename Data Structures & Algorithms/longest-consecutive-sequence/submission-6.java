class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int n=nums.length;
        int i;
        if(n==0){
            return 0;
        }
        for(i=0;i<n;i++){
            set.add(nums[i]);
        }
        int streak=1;
        int maxstreak=1;
        for(int num:set){
            if(!set.contains(num-1)){
            streak=1;
            while(set.contains(num+streak)){
                streak++;
                maxstreak=Math.max(streak,maxstreak);
            }
            }
        }
        
        return maxstreak;
    }
}
