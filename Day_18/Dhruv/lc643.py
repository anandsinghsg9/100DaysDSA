# Leetcode problem 643: Maximum Average Subarray I

class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        max_sum = sum(nums[:k])
        current_sum = max_sum
        for i in range(k, len(nums)):
            current_sum += nums[i] - nums[i - k]
            max_sum = max(max_sum, current_sum)
        return max_sum / k