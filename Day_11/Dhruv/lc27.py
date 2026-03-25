#leetcode 27. Remove Element

class Solution(object): 
    def removeElement(self, nums, val):
        left=0 
        right=len(nums)-1
        k=0
        while left<=right: 
            if nums[left]==val: 
                temp=nums[left] 
                nums[left]=nums[right] 
                nums[right]=temp 
                right-=1     
            else:
                left+=1 
            
        return left