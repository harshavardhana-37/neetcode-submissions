class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int n=prices.length;
        int maxprof=0;
        int i ;
        for(i=1;i<n;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
               
                maxprof=Math.max(maxprof,prices[i]-minprice );
            }
        }
        return maxprof;
        
    }
}
