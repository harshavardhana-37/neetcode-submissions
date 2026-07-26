class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapping={}
        res=[]
        for i in range(0,len(nums)):
            need=target-nums[i]
            if need in mapping:
               
               res.append(mapping[need])
               res.append(i)
               
            else:
                mapping[nums[i]]=i
        return res