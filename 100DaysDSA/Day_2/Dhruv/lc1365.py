#LeetCode Problem: 1365. How Many Numbers Are Smaller Than the Current Number

class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        ans=[]
        l=len(nums)
        for i in range(l):
            count=0
            for j in range(l):
                if nums[i]>nums[j]:
                    count=count+1
            ans.append(count)
        return ans