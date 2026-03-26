package Day_13.Anushka;
import java.util.*;
public class gridPartitionCheck2 {
    public static void main(String[] args) {
        int[][] grid = {
            {1, 5},
            {4, 6}
        };

        Solution obj = new Solution();
        System.out.println(obj.canPartitionGrid(grid)); // output
    }
}
class Solution {
    int m, n;
    long totalSum;
    int[][] grid;
    HashMap<Long, List<int[]>> map;

    public boolean canPartitionGrid(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        totalSum = 0;
        map = new HashMap<>();

        // build map + total sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += grid[i][j];

                long val = grid[i][j];
                map.computeIfAbsent(val, k -> new ArrayList<>())
                   .add(new int[]{i, j});
            }
        }

        // -------- HORIZONTAL CUT --------
        long currSum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                currSum += grid[i][j];
            }

            if (isValid(currSum, totalSum - currSum, i, true))
                return true;
        }

        // -------- VERTICAL CUT --------
        currSum = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                currSum += grid[i][j];
            }

            if (isValid(currSum, totalSum - currSum, j, false))
                return true;
        }

        return false;
    }

    // 🔥 validation
    boolean isValid(long sumA, long sumB, int index, boolean rowCut) {

        if (sumA == sumB) return true;

        long diff = sumA - sumB;
        long absDiff = Math.abs(diff);

        if (!map.containsKey(absDiff)) return false;

        for (int[] cell : map.get(absDiff)) {
            int r = cell[0], c = cell[1];

            boolean inA = rowCut ? r <= index : c <= index;

            // ensure correct section
            if (diff > 0 && !inA) continue;
            if (diff < 0 && inA) continue;

            int minR, maxR, minC, maxC;

            if (inA) {
                minR = 0;
                minC = 0;
                maxR = rowCut ? index : m - 1;
                maxC = rowCut ? n - 1 : index;
            } else {
                maxR = m - 1;
                maxC = n - 1;
                minR = rowCut ? index + 1 : 0;
                minC = rowCut ? 0 : index + 1;
            }

            int rows = maxR - minR + 1;
            int cols = maxC - minC + 1;

            // 1D cases
            if (rows == 1) {
                if (c == minC || c == maxC) return true;
            } else if (cols == 1) {
                if (r == minR || r == maxR) return true;
            } else {
                return true; // 2D always safe
            }
        }

        return false;
    }
}