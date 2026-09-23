class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        
        int n=nums.length;
        int minlen=n+1;
        for(right=0;right<n;right++){
            sum+=nums[right];
            
            while(sum>=target){
                minlen=Math.min(minlen,right-left+1);
                sum-=nums[left];
                left++;
                
            }
        }
        return minlen==n+1?0:minlen;
    }
}