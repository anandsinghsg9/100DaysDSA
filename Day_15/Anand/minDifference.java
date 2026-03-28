package Day_15.Anand;

public class minDifference {
    public static void main(String[] args) {
        minDifference sol = new minDifference();

        // Test Case 1: 1 and 2 are close
        int[] test1 = {0, 1, 0, 0, 2, 1, 0};
        System.out.println("Test 1 Result: " + sol.minAbsoluteDifference(test1)); // Should be 1

        // Test Case 2: 2 comes before 1
        int[] test2 = {2, 0, 0, 0, 1};
        System.out.println("Test 2 Result: " + sol.minAbsoluteDifference(test2)); // Should be 4

        // Test Case 3: One number is missing
        int[] test3 = {1, 0, 1, 0};
        System.out.println("Test 3 Result: " + sol.minAbsoluteDifference(test3)); // Should be -1
    }
    public int minAbsoluteDifference(int[] nums) {
        int result = Integer.MAX_VALUE;
        int x = -1;
        int y = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                x = i;
                if (y != -1) {
                    int difference = Math.abs(x - y);
                    result = Math.min(result, difference);
                }
            } else if (nums[i] == 2) {
                y = i;
                if (x != -1) {
                    int difference = Math.abs(x - y);
                    result = Math.min(result, difference);
                }
            }
        }
        
        // Final check to see if both were ever found
        return (x != -1 && y != -1) ? result : -1;
    }
    
}
