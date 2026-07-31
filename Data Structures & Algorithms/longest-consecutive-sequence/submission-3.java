class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set= new HashSet<>();
        int maxcount=Integer.MIN_VALUE;
        int i;
        if(nums.length==0){
            return 0;
        }
        for(int num:nums){
            set.add(num);
        }
        //{2,3,4,5,10,20}

        for(int num:set){
            int count=0;
            if(!set.contains(num-1)){
                while(set.contains(num+count)){
                    count++;
                    maxcount=Math.max(count,maxcount);
                }
            }
            
        }
        return maxcount;
        
    }
}
