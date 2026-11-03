class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        count=1
        maxcount=1
        if len(nums)==0:
            return 0
        myset=set()
        for num in nums:
            myset.add(num)
        for num in myset:
            if(num-1 in myset): continue
            else:
                count=1
                while(num+count in myset):
                    count+=1
                    maxcount=max(count,maxcount)
        return maxcount
