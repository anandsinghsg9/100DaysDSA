package Anand;

public class goodNumber {
    static class Solution {
        public int rotatedDigits(int n) {
            int count = 0;
            // Iterate through every number from 1 to n
            for (int i = 1; i <= n; i++) {
                if (isGood(i)) {
                    count++;
                }
            }
            return count;
        }

        private boolean isGood(int i) {
            boolean hasRotatingDigit = false;
            
            while (i > 0) {
                int digit = i % 10;
                
                // 1. If it contains 3, 4, or 7, it's invalid
                if (digit == 3 || digit == 4 || digit == 7) {
                    return false;
                }
                
                // 2. If it contains 2, 5, 6, or 9, it will change when rotated
                if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                    hasRotatingDigit = true;
                }
                
                i /= 10;
            }
            
            // A number is "good" only if it's valid AND it changes
            return hasRotatingDigit;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test Case 1
        int n1 = 10;
        System.out.println("Input: n = 10 | Output: " + sol.rotatedDigits(n1)); // Expected: 4

        // Test Case 2
        int n2 = 1;
        System.out.println("Input: n = 1  | Output: " + sol.rotatedDigits(n2)); // Expected: 0

        // Test Case 3
        int n3 = 2;
        System.out.println("Input: n = 2  | Output: " + sol.rotatedDigits(n3)); // Expected: 1
    }
}
