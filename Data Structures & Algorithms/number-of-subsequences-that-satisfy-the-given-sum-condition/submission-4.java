class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

       int ans=0;
        int n=nums.length;
        int pow[]= new int [n];
        int mod=(int)1e9+7;
        pow[0]=1;
        
        for(int i=1;i<n;i++){
        pow[i]=(pow[i-1]*2)%mod;
        }
         int left=0;
         ans=0;
       int right=n-1;
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                ans=(ans+pow[right-left])%mod;
                left++;
            }
            else right--;
        }
        
        return ans;
    }
}