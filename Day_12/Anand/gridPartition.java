package Anand;
public class gridPartition {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Can be partitioned horizontally (between row 0 and 1)
        int[][] grid1 = {
            {1, 2, 3}, // Sum = 6
            {2, 2, 2}  // Sum = 6
        };
        System.out.println("Test 1 (Horizontal): " + sol.canPartitionGrid(grid1)); // Expected: true

        // Test Case 2: Can be partitioned vertically (between column 1 and 2)
        int[][] grid2 = {
            {1, 5, 6},
            {1, 0, 1}
        };
        // Col sums: [2, 5, 7] -> 2+5 = 7. Correct!
        System.out.println("Test 2 (Vertical): " + sol.canPartitionGrid(grid2)); // Expected: true

        // Test Case 3: Cannot be partitioned
        int[][] grid3 = {
            {1, 2},
            {3, 5}
        };
        System.out.println("Test 3 (No Partition): " + sol.canPartitionGrid(grid3)); // Expected: false
    }
}

class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        // Handle empty or null grids
        if (grid == null || grid.length == 0) return false;

        // Calculate Row Sums and Total Sum
        long[] sumR = new long[grid.length]; 
        long totalSumR = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sumR[i] += grid[i][j];
            }
            totalSumR += sumR[i];
        }

        // Calculate Column Sums and Total Sum (totalSumC will be equal to totalSumR)
        long[] sumC = new long[grid[0].length]; 
        long totalSumC = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                sumC[i] += grid[j][i];
            }
            totalSumC += sumC[i];
        }

        // Check Horizontal Partition (Rows)
        long prefix = 0;
        for (int i = 0; i < sumR.length - 1; i++) {
            prefix += sumR[i];
            long suffix = totalSumR - prefix;
            if (prefix == suffix) {
                return true;
            }
        }

        // Check Vertical Partition (Columns)
        prefix = 0;
        for (int i = 0; i < sumC.length - 1; i++) {
            prefix += sumC[i];
            long suffix = totalSumC - prefix;
            if (prefix == suffix) {
                return true;
            }
        }

        return false;
    }
} 
    

