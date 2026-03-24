#leetcode 724. Find Pivot Index

class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        left_sum=0
        right_sum=0
        for i in range (len(nums)):
            right_sum=sum(nums)-nums[i]-left_sum
            if left_sum==right_sum:
                return i
            left_sum+=nums[i]

        return -1