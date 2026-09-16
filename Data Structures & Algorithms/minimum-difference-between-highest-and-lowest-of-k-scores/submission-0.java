class Solution {
    public int minimumDifference(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int diff=0;
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        mindiff=nums[k-1]-nums[0];


        for(int i=k-1;i<nums.length;i++){
            diff=nums[i]-nums[i-k+1];
            mindiff=Math.min(mindiff,diff);
        }
        return mindiff;
    }
}