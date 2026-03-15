#leetcode problem 11. Container With Most Water 

class Solution(object):
    def maxArea(self, height):
        low = 0
        high = len(height) - 1
        max_area = 0

        while low < high:
            length = min(height[low], height[high])
            width = high - low
            max_area = max(max_area, length * width)

            if height[low] < height[high]:
                low+=1
            else:
                high-=1
        
        return max_area