class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right =0;
        for(int n:piles) right=Math.max(n,right);
        int mid=0;
        int maxsum=right;
        while(left<=right){
            mid=left+(right-left)/2;
            long sum=0;
            for(int num:piles){
                sum+=(num+mid-1)/mid;
            }
            if(sum>h) left=mid+1;
            else{
                maxsum=mid;
                right=mid-1;
            }
        }
        return maxsum;
    }
}
