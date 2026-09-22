class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]= new int [n];
        int left=0;
        int right=n-1;
        int pos=right;
        while(right>=left){
            int prod1=nums[left]*nums[left];
            int prod2= nums[right]*nums[right];
            if(prod1> prod2){
                ans[pos]=prod1;
                //right--;
                left++;
            }
            else{
                ans[pos]=prod2;
                right--;
            }
            pos--;
        }
        return ans;
        
    }
}