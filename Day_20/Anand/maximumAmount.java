import java.util.Arrays;

public class maximumAmount {
    public static void main(String[] args) {
        maximumAmount sol = new maximumAmount();

        // Test Case from your previous message
        int[][] coins = {
            {0, 1, -1},
            {1, -2, 3},
            {2, -3, 4}
        };

        int result = sol.maximumAmount(coins);
        
        System.out.println("Grid:");
        for (int[] row : coins) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("---------------------------");
        System.out.println("Maximum Profit: " + result);
        
        // Expected Output: 8
        if (result == 8) {
            System.out.println("Test Passed! ✅");
        } else {
            System.out.println("Test Failed. Expected 8 but got " + result + " ❌");
        }
    }
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        
        // dp[i][j][k] -> max coins at (i,j) with k neutralizes remaining
        long[][][] dp = new long[m][n][3];
        
        // Initialize with a very small number to handle negative coin values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Long.MIN_VALUE / 2);
            }
        }

        // Base case: Starting point (0,0)
        dp[0][0][2] = coins[0][0]; // No power used
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0; // Use 1st power to neutralize starting robber
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0 && j == 0) continue;

                    long prev = Long.MIN_VALUE / 2;
                    if (i > 0) prev = Math.max(prev, dp[i - 1][j][k]);
                    if (j > 0) prev = Math.max(prev, dp[i][j - 1][k]);

                    // Skip unreachable states
                    if (prev <= Long.MIN_VALUE / 4) continue;

                    // Choice 1: Standard move (add the coin/robber value)
                    dp[i][j][k] = Math.max(dp[i][j][k], prev + coins[i][j]);

                    // Choice 2: Use power (neutralize robber if k > 0)
                    if (k > 0 && coins[i][j] < 0) {
                        dp[i][j][k - 1] = Math.max(dp[i][j][k - 1], prev);
                    }
                }
            }
        }

        // Return the best possible outcome regardless of powers left
        long res = Math.max(dp[m - 1][n - 1][0], 
                   Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
                   
        return (int) res;
    }
}
