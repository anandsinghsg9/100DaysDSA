package Day_6.Sahil;

public class MaxSubArray {

    static class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int maxSub = nums[0];
            int currSum = 0;

            for(int i = 0; i <= n - 1; i++){
                if(currSum < 0){
                    currSum = 0;
                }
                currSum += nums[i];
                maxSub = Math.max(maxSub, currSum);
            }
            return maxSub;
        }
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Solution obj = new Solution();
        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}