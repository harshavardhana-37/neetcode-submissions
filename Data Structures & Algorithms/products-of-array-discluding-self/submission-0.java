class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefixprod=1;
        int postfixprod=1;
        int ans[] = new int [n];
        Arrays.fill(ans,1);
        for(int i=0;i<n;i++){
            ans[i]*=prefixprod;
            prefixprod*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]*=postfixprod;
            postfixprod*=nums[i];
        }
        return ans;
        
    }
}  
