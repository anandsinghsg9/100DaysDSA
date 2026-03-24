package Day_11.Anushka;

public class constructAproductMatrix {

    public static int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                long prod = 1;

                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < m; y++) {

                        if (x == i && y == j) continue;

                        prod = (prod * grid[x][y]) % 12345;
                    }
                }

                ans[i][j] = (int) prod;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {1, 2},
            {3, 4}
        };

        int[][] result = constructProductMatrix(grid);

        // print output
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}