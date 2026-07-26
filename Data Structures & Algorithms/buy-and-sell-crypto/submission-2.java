class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int n=prices.length;
        int i;
        int maxprof=0;
        for(i=0;i<n;i++){
            if(minprice>prices[i]){
                minprice=prices[i];
            }
            else if(prices[i]-minprice>maxprof){
                maxprof=prices[i]-minprice;
            }
        }
        return maxprof;
        
    }
}
