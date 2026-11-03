class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
        set.add(num);
        int maxcount=0;
        for(int num:set){
            if(set.contains(num-1)) continue;
            else {
                int count=0;
                while(set.contains(num+count)){
                    count++;
                    maxcount=Math.max(count, maxcount);
                }

            }
        }
        return maxcount;
    }
}
