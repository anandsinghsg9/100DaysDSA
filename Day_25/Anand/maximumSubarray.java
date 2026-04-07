package Day_25.Anand;

public class maximumSubarray {
    public int maxSubArray(int[] nums) {
        // Initialize maxSoFar with the first element to handle 
        // arrays with only one element or all negative numbers.
        int maxSoFar = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            // If currentSum is negative, it's a burden. 
            // Reset it to 0 before adding the current number.
            if (currentSum < 0) {
                currentSum = 0;
            }
            
            currentSum += num;
            
            // Update the global maximum found so far
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }

        return maxSoFar;

    }
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        maximumSubarray sol= new maximumSubarray();
        System.out.println(sol.maxSubArray(nums));
    }
    
}
