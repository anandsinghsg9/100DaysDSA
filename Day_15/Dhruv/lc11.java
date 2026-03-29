//leetcode 11. Container With Most Water

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right= height.length-1;
        int max_area=0;
        while(left<right){
            int length=Math.min(height[left],height[right]);
            int width=right-left;
            max_area= Math.max(max_area, length * width);
            
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}