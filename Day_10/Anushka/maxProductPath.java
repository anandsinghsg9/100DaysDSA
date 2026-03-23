package Day_10.Anushka;
public class maxProductPath {
    public int maxProductPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long[][] max = new long[m][n];
        long[][] min = new long[m][n];
        int MOD = 1000000007;
        max[0][0] = min[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                long val = grid[i][j];
                long maxVal = Long.MIN_VALUE;
                long minVal = Long.MAX_VALUE;
                // from top
                if (i > 0) {
                    long a = max[i-1][j] * val;
                    long b = min[i-1][j] * val;
                    maxVal = Math.max(maxVal, Math.max(a, b));
                    minVal = Math.min(minVal, Math.min(a, b));
                }

                // from left
                if (j > 0) {
                    long c = max[i][j-1] * val;
                    long d = min[i][j-1] * val;

                    maxVal = Math.max(maxVal, Math.max(c, d));
                    minVal = Math.min(minVal, Math.min(c, d));
                }

                max[i][j] = maxVal;
                min[i][j] = minVal;
            }
        }

        long ans = max[m-1][n-1];
        return ans < 0 ? -1 : (int)(ans % MOD);
    }
     public static void main(String[] args) {
        maxProductPath obj = new maxProductPath();

        int[][] grid = {
            {1, -2, 1},
            {1, -2, 1},
            {3, -4, 1}
        };

        int result = obj.maxProductPath(grid);
        System.out.println("Answer: " + result);
    }
}