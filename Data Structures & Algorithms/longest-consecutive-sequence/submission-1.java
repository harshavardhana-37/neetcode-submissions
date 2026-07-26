class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for( int num:nums){
            set.add(num);
        }
        int streak=0;
        int maxstreak=0;

        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }
            streak=0;
            
            while(set.contains(num+streak)){
                streak++;
                maxstreak=Math.max(streak,maxstreak);
            }
        }
        return maxstreak;
    }
}
