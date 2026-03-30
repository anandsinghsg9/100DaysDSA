# LeetCode: 4. Median of Two Sorted Arrays (Not Optimal Solution)

class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums=nums1+nums2
        n=len(nums)
        nums.sort()
        if n%2!=0:
            return float(nums[n//2])
        else:
            mid1 = nums[n // 2 - 1]
            mid2 = nums[n // 2]
            return (float(mid1) + float(mid2)) / 2.0