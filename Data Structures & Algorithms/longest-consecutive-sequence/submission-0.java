class Solution {
    public int longestConsecutive(int[] nums) {
        int streak=0;
        int maxstreak=0;
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
       // {2,20,4,10,3,4,5}
       //{0,3,2,5,4,6,1}
       for(int num:set){
        if(!set.contains(num-1)){
            streak=1;
            while(set.contains(num+streak)){
                streak++;
            }
            maxstreak=Math.max(maxstreak,streak);
        }
       }
        return maxstreak;
    }
}
