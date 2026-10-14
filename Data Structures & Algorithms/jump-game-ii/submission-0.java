class Solution {
    public int jump(int[] nums) {
        int left=0;
        int right=0;
        int ans=0;
        while(right<nums.length-1){
            int farthermost=0;
            for(int i=left;i<=right;i++){
                farthermost=Math.max(farthermost,nums[i]+i);
            }
            left=right+1;
            right=farthermost;
            ans++;
        }
        return ans;
    }
}
