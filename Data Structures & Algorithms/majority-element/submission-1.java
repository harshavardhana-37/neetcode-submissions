class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==maj){
                count++;
            }
            else{
                if(count<=0) maj=nums[i];
                else count--;
            }
        }
        return maj;
    }
}