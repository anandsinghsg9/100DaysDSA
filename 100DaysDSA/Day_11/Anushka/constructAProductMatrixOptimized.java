package Day_11.Anushka;

public class constructAProductMatrixOptimized {

    public static int[][] constructProductMatrix(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int MOD = 12345;

        int total = rows * cols;

        // 🔹 flatten matrix
        int[] flat = new int[total];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flat[index++] = grid[i][j] % MOD;
            }
        }

        // 🔹 left product (prefix)
        long[] leftProduct = new long[total];
        leftProduct[0] = 1;

        for (int i = 1; i < total; i++) {
            leftProduct[i] = (leftProduct[i - 1] * flat[i - 1]) % MOD;
        }

        // 🔹 build result using right product
        int[][] result = new int[rows][cols];
        long rightProduct = 1;

        for (int i = total - 1; i >= 0; i--) {
            long value = (leftProduct[i] * rightProduct) % MOD;

            int r = i / cols;
            int c = i % cols;
            result[r][c] = (int) value;

            rightProduct = (rightProduct * flat[i]) % MOD;
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 2},
            {3, 4}
        };
        int[][] answer = constructProductMatrix(grid);
        // print result
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}