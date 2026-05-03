#Leetcode problem 169: Majority Element

class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        candidate = None
        count = 0

        for num in nums:
            if count == 0:
                candidate = num
            
            if num == candidate:
                count += 1
            else:
                count -= 1
        if nums.count(candidate) > len(nums) // 2:
            return candidate
        
        return -1