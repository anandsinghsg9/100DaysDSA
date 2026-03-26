package Anand;
public class gridPartition {
    public static void main(String[] args) {
        Solution sol = new Solution();

       
        int[][] grid1 = {
            {1, 2, 3}, 
            {2, 2, 2}  
        };
        System.out.println("Test 1 (Horizontal): " + sol.canPartitionGrid(grid1));


        int[][] grid2 = {
            {1, 5, 6},
            {1, 0, 1}
        };

        System.out.println("Test 2 (Vertical): " + sol.canPartitionGrid(grid2)); 

        int[][] grid3 = {
            {1, 2},
            {3, 5}
        };
        System.out.println("Test 3 (No Partition): " + sol.canPartitionGrid(grid3)); 
    }
}

class Solution {
    public boolean canPartitionGrid(int[][] grid) {

        if (grid == null || grid.length == 0) return false;


        long[] sumR = new long[grid.length]; 
        long totalSumR = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sumR[i] += grid[i][j];
            }
            totalSumR += sumR[i];
        }

        long[] sumC = new long[grid[0].length]; 
        long totalSumC = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                sumC[i] += grid[j][i];
            }
            totalSumC += sumC[i];
        }

        
        long prefix = 0;
        for (int i = 0; i < sumR.length - 1; i++) {
            prefix += sumR[i];
            long suffix = totalSumR - prefix;
            if (prefix == suffix) {
                return true;
            }
        }

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
    

