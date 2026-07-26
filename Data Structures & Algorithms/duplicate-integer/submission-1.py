class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        mapping={}
        for num in nums:
            if num in mapping:
                return True
            mapping[num]=1
        return False