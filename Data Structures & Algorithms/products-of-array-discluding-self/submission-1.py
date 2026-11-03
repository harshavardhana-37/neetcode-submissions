class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        prefixprod=1
        postfixprod=1
        ans=[1]*n
        for i in range(0,n):
            ans[i]*=prefixprod
            prefixprod*=nums[i]

        for i in range(n-1,-1,-1):
            ans[i]*=postfixprod
            postfixprod*=nums[i]
        return ans;