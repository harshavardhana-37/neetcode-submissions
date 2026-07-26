class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        miniprice,maxprofit=float("inf"),0
        for price in prices:
            miniprice=min(miniprice,price)
            maxprofit=max(maxprofit,price-miniprice)
        return maxprofit
        